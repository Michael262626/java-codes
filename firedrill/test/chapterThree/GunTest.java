package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GunTest {
    @BeforeEach
    public void initializer(){
        Gun pistol = new Gun();
    }
    @Test
    public void shoot(){
        Gun.ammo = 10;
        Gun.shoot();
        assertEquals(9, Gun.ammo);
    }
    @Test

    public void testIsEmpty(){
        Gun.ammo = 0;
        assertTrue(Gun.isEmpty());
    }
    @Test
    public void testReload(){
        Gun.ammo = 5;
        Gun.reload();
        assertEquals(10, Gun.ammo);
    }
    @Test
    public void testGunIsLoaded() {
        Gun.ammo = 10;
        assertFalse(Gun.isEmpty());
    }
    @Test
    void testReloadFromNoAmmoLeft(){
        Gun.ammo = 0;
        Gun.reload();
        assertEquals(10, Gun.ammo);
    }
    @Test
    void testToShootIfGunIsEmpty(){
        Gun.ammo = 0;
        assertThrows(IllegalArgumentException.class, Gun::shoot);
    }
}