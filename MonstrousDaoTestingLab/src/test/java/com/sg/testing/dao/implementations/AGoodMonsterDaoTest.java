package com.sg.testing.dao.implementations;

import com.sg.testing.dao.MonsterDao;
import com.sg.testing.model.Monster;
import com.sg.testing.model.MonsterType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AGoodMonsterDaoTest {

    MonsterDao dao;

    @BeforeEach
    void setUp() {
        dao = new AGoodMonsterDao();
    }

    private Monster makeMonster(String name, MonsterType type, int peopleEaten, String favoriteFood){
        return new Monster(name, type, peopleEaten, favoriteFood);
    }

    @Test
    public void testAddGetMonster(){

        Monster m1 = makeMonster("yeti", MonsterType.YETI, 5, "Ice Cone");

        dao.addMonster(1, m1);
        Monster retrievedMonster = dao.getMonster(1);

        assertEquals(m1, retrievedMonster, "Added monster should be the same as the retrieved monster.");
    }

    @Test
    public void testGetAllMonsters(){

        Monster m1 = makeMonster("Evil Vamp", MonsterType.VAMPIRE, 1000, "Blood");
        Monster m2 = makeMonster("Evil Yeti", MonsterType.YETI, 500, "Hearts");

        dao.addMonster(1, m1);
        dao.addMonster(2, m2);

        List<Monster> getAll = dao.getAllMonsters();

        assertEquals(2, getAll.size(), "There should be 2 monsters total.");
        assertTrue(getAll.contains(m1) && getAll.contains(m2), "The 2 monsters created should be retrieved both successfully");
    }

    @Test
    public void testUpdateMonster(){

        Monster m1 = makeMonster("James", MonsterType.WEREWOLF, 0, "Burgers");
        Monster m1Updated = makeMonster("James", MonsterType.WEREWOLF, 1, "Humans");

        dao.addMonster(1, m1);
        dao.updateMonster(1, m1Updated);
        Monster updatedDao = dao.getMonster(1);

        assertEquals(m1Updated, updatedDao, "Updated monster should match new version.");
    }

    @Test
    public void testRemoveMonster() {
        Monster m = makeMonster("LizardMan", MonsterType.LIZARDMAN, 3, "Crickets");
        dao.addMonster(1, m);
        Monster removed = dao.removeMonster(1);

        assertEquals(m, removed, "Removed monster should be the same as the added one.");
        assertNull(dao.getMonster(1), "Monster should no longer exist after removal.");
    }
}