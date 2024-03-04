package chapterThree;

public class Gun {
    private static String name;
    static int ammo;
    private boolean isEmpty = true;

    public static void shoot(){
        if(ammo <= 0)  throw new IllegalArgumentException("No ammo");
        ammo -= 1;
    }
    public static String getName(){
        return name;
    }
    public static boolean isEmpty(){
        return ammo == 0;
    }
    public static void reload(){
        if(ammo > 0){
         ammo = 10 -ammo;
            ammo += ammo;
        }
        else {
            ammo += 10;
        }
    }

}


