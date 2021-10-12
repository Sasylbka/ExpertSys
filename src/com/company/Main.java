package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static class Projectiles{
        String name;
        boolean explosive;
        String typeOfExplosive;
        Projectiles(String name, boolean explosive,String typeOfExplosive){
            this.name=name;
            this.explosive=explosive;
            if(explosive){
                this.typeOfExplosive=typeOfExplosive;
            }
        }
    }

    public static class TypesOfWeapons{
        String name;
        boolean haveProjectiles;
        Projectiles strikingProjectiles;
        String rateOfFire;
        TypesOfWeapons(String name,boolean haveProjectiles,Projectiles strikingProjectiles,String rateOfFire){
            this.name=name;
            this.haveProjectiles=haveProjectiles;
            if(haveProjectiles) {
                this.strikingProjectiles = strikingProjectiles;
                this.rateOfFire = rateOfFire;
            }
        }
    }

    public static class Weapon{
        String name;
        String sizeOfWeapon;
        TypesOfWeapons type;
        String salvationPlan;
        String rangeOfStrike;

        Weapon(String name,String sizeOfWeapon,TypesOfWeapons type,String salvationPlan,String rangeOfStrike){
            this.name=name;
            this.sizeOfWeapon=sizeOfWeapon;
            this.type=type;
            this.salvationPlan= salvationPlan;
            this.rangeOfStrike=rangeOfStrike;
        }
    }


    public static void main(String[] args) {
        List<Weapon> allWeapon = new ArrayList<>();
        allWeapon.add(new Weapon("Нож","Маленький", new TypesOfWeapons("Холодное",false,null,null),
                "От этого оружия необходимо держаться на расстоянии ","Длина вытянутой руки"));

        allWeapon.add(new Weapon("Граната","Маленький", new TypesOfWeapons("Метательное",true,
                new Projectiles("Взрывные снаряды",true,"Взрываются с задержкой"),null),
                "От этого оружия необходимо держаться на средней дистанции.В случае попадания в зону области поражения – необходимо убегать.",
                "Дальность броска гранаты – 30 метров.Зона поражения – 7 метров"));

        allWeapon.add(new Weapon("Коктейль Молотова","Маленький", new TypesOfWeapons("Метательное",true,
                new Projectiles("Взрывные снаряды",true,"Взрываются без задержкой"),null),
                "От этого оружия необходимо держаться на средней дистанции.В случае попадания в зону поражения огня – необходимо выбегать из неё",
                "Дальность броска гранаты – 30 метров.Зона поражения – 3 метра"));

        allWeapon.add(new Weapon("Пистолет","Маленький", new TypesOfWeapons("Огнестрельное",true,
                new Projectiles("Пули",false,null),"Низкий"),
                "От этого оружия необходимо держаться на средней дистанции и по возможности прятаться за укрытия",
                "Зона поражения пистолета – 50 метров"));

        allWeapon.add(new Weapon("Автомат","Средний", new TypesOfWeapons("Огнестрельное",true,
                new Projectiles("Пули",false,null),"Высокий"),
                "От этого оружия необходимо держаться на большой дистанции и по возможности прятаться за укрытия",
                "Зона поражения пистолета – 1000 метров"));

        allWeapon.add(new Weapon("Дробовик","Средний", new TypesOfWeapons("Огнестрельное",true,
                new Projectiles("Дробь",false,null),"Низкий"),
                     "От этого оружия нужно держаться на средней дистанции и ни в коем случае не подходить близко",
                "Зона поражения дробовика – 40 метров"));

        allWeapon.add(new Weapon("Карабин","Средний", new TypesOfWeapons("Огнестрельное",true,
                new Projectiles("Пули",false,null),"Высокий"),
                "От этого оружия нужно держаться на большой дистанции, и по возможности прятаться за укрытиями",
                "Зона поражения – 1000 метров"));

        allWeapon.add(new Weapon("Пулемёт","Большой", new TypesOfWeapons("Огнестрельное",true,
                new Projectiles("Пули",false,null),"Высокий"),
                "От этого оружия необходимо прятаться за укреплённые металлические укрытия и ожидать перегрева оружия или окончания боезапаса",
                "Зона поражения – 1000 метров"));

        allWeapon.add(new Weapon("Снайперская винтовка","Большой", new TypesOfWeapons("Огнестрельное",true,
                new Projectiles("Пули",false,null),"Низкий"),
                "От этого оружия необходимо перебегать от одного укрытия к другому, пытаясь сократить дистанцию.",
                "Зона поражения – 2000 метров"));

        allWeapon.add(new Weapon("Гранатомёт","Большой", new TypesOfWeapons("Огнестрельное",true,
                new Projectiles("Взрывные снаряды",true,"Взрываются с задержкой"),"Средний"),
                "Необходимо быстро сокращать дистанцию, уходя из зон поражения гранат",
                "Радиус поражения гранат – 7 метров. Дальность поражения 200 метров"));

        allWeapon.add(new Weapon("РПГ","Большой", new TypesOfWeapons("Огнестрельное",true,
                new Projectiles("Взрывные снаряды",true,"Взрываются без задержкой"),"Низкий "),
                "Необходимо быстро сокращать дистанцию до стрелка, пытаясь уклонится от траектории движения ракеты.",
                "Зона поражения ракеты – 15 метров. Дальность поражения 500 метров"));


    }
}
