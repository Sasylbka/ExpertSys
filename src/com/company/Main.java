package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static class Projectiles {
        String name;
        boolean explosive;
        String typeOfExplosive;

        Projectiles(String name, boolean explosive, String typeOfExplosive) {
            this.name = name;
            this.explosive = explosive;
            if (explosive) {
                this.typeOfExplosive = typeOfExplosive;
            }
        }
    }

    public static class TypesOfWeapons {
        String name;
        boolean haveProjectiles;
        Projectiles strikingProjectiles;
        String rateOfFire;

        TypesOfWeapons(String name, boolean haveProjectiles, Projectiles strikingProjectiles, String rateOfFire) {
            this.name = name;
            this.haveProjectiles = haveProjectiles;
            if (haveProjectiles) {
                this.strikingProjectiles = strikingProjectiles;
                this.rateOfFire = rateOfFire;
            }
        }

        TypesOfWeapons() {

        }
    }

    public static class Weapon {
        String name;
        String sizeOfWeapon;
        TypesOfWeapons type;
        String salvationPlan;
        String rangeOfStrike;

        Weapon(String name, String sizeOfWeapon, TypesOfWeapons type, String salvationPlan, String rangeOfStrike) {
            this.name = name;
            this.sizeOfWeapon = sizeOfWeapon;
            this.type = type;
            this.salvationPlan = salvationPlan;
            this.rangeOfStrike = rangeOfStrike;
        }

        Weapon() {

        }
    }


    public static void main(String[] args) {
        List<Weapon> allWeapon = new ArrayList<>();
        allWeapon.add(new Weapon("Нож", "Маленький", new TypesOfWeapons("Холодное", false, null, null),
                "От этого оружия необходимо держаться на расстоянии ", "Длина вытянутой руки"));

        allWeapon.add(new Weapon("Граната", "Маленький", new TypesOfWeapons("Метательное", true,
                new Projectiles("Взрывные снаряды", true, "Взрываются с задержкой"), "Низкий"),
                "От этого оружия необходимо держаться на средней дистанции.В случае попадания в зону области поражения – необходимо убегать.",
                "Дальность броска гранаты – 30 метров.Зона поражения – 7 метров"));

        allWeapon.add(new Weapon("Коктейль Молотова", "Маленький", new TypesOfWeapons("Метательное", true,
                new Projectiles("Взрывные снаряды", true, "Взрываются без задержки"), "Низкий"),
                "От этого оружия необходимо держаться на средней дистанции.В случае попадания в зону поражения огня – необходимо выбегать из неё",
                "Дальность броска – 30 метров.Зона поражения – 3 метра"));

        allWeapon.add(new Weapon("Пистолет", "Маленький", new TypesOfWeapons("Огнестрельное", true,
                new Projectiles("Пули", false, null), "Низкий"),
                "От этого оружия необходимо держаться на средней дистанции и по возможности прятаться за укрытия",
                "Зона поражения пистолета – 50 метров"));

        allWeapon.add(new Weapon("Автомат", "Средний", new TypesOfWeapons("Огнестрельное", true,
                new Projectiles("Пули", false, null), "Высокий"),
                "От этого оружия необходимо держаться на большой дистанции и по возможности прятаться за укрытия",
                "Зона поражения пистолета – 1000 метров"));

        allWeapon.add(new Weapon("Дробовик", "Средний", new TypesOfWeapons("Огнестрельное", true,
                new Projectiles("Дробь", false, null), "Низкий"),
                "От этого оружия нужно держаться на средней дистанции и ни в коем случае не подходить близко",
                "Зона поражения дробовика – 40 метров"));

        allWeapon.add(new Weapon("Карабин", "Средний", new TypesOfWeapons("Огнестрельное", true,
                new Projectiles("Пули", false, null), "Высокий"),
                "От этого оружия нужно держаться на большой дистанции, и по возможности прятаться за укрытиями",
                "Зона поражения – 1000 метров"));

        allWeapon.add(new Weapon("Пулемёт", "Большой", new TypesOfWeapons("Огнестрельное", true,
                new Projectiles("Пули", false, null), "Высокий"),
                "От этого оружия необходимо прятаться за укреплённые металлические укрытия и ожидать перегрева оружия или окончания боезапаса",
                "Зона поражения – 1000 метров"));

        allWeapon.add(new Weapon("Снайперская винтовка", "Большой", new TypesOfWeapons("Огнестрельное", true,
                new Projectiles("Пули", false, null), "Низкий"),
                "От этого оружия необходимо перебегать от одного укрытия к другому, пытаясь сократить дистанцию.",
                "Зона поражения – 2000 метров"));

        allWeapon.add(new Weapon("Гранатомёт", "Большой", new TypesOfWeapons("Огнестрельное", true,
                new Projectiles("Взрывные снаряды", true, "Взрываются c задержкой"), "Средний"),
                "Необходимо быстро сокращать дистанцию, уходя из зон поражения гранат",
                "Радиус поражения гранат – 7 метров. Дальность поражения 200 метров"));

        allWeapon.add(new Weapon("РПГ", "Большой", new TypesOfWeapons("Огнестрельное", true,
                new Projectiles("Взрывные снаряды", true, "Взрываются без задержки"), "Низкий"),
                "Необходимо быстро сокращать дистанцию до стрелка, пытаясь уклонится от траектории движения ракеты.",
                "Зона поражения ракеты – 15 метров. Дальность поражения 500 метров"));

        Weapon pattern = new Weapon();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Перед вами находится противник.Насколько большое его оружие?");
        System.out.println("1.Маленькое");
        System.out.println("2.Среднее");
        System.out.println("3.Большое");
        String temp = scanner.next();
        if (temp.equals("1") || temp.equals("2") || temp.equals("3")) {
            if (temp.equals("1")) {
                pattern.sizeOfWeapon = "Маленький";
            }
            if (temp.equals("2")) {
                pattern.sizeOfWeapon = "Средний";
            }
            if (temp.equals("3")) {
                pattern.sizeOfWeapon = "Большой";
            }
        } else {
            boolean correct = false;
            while (correct) {
                System.out.println("Неправильный ввод");
                System.out.println("Перед вами находится противник.Насколько большое его оружие?");
                System.out.println("1.Маленькое");
                System.out.println("2.Среднее");
                System.out.println("3.Большое");
                temp = scanner.next();
                if (temp.equals("1") || temp.equals("2") || temp.equals("3")) {
                    if (temp.equals("1")) {
                        pattern.sizeOfWeapon = "Маленький";
                    }
                    if (temp.equals("2")) {
                        pattern.sizeOfWeapon = "Средний";
                    }
                    if (temp.equals("3")) {
                        pattern.sizeOfWeapon = "Большой";
                    }
                    correct = true;
                }
            }
        }
        System.out.println("Какой тип у оружия ?");
        System.out.println("1.Метательное");
        System.out.println("2.Огнестрельное");
        System.out.println("3.Холодное");
        temp = scanner.next();
        if (temp.equals("1") || temp.equals("2") || temp.equals("3")) {
            if (temp.equals("1")) {
                TypesOfWeapons newType = new TypesOfWeapons();
                newType.name = "Метательное";
                pattern.type = newType;
            }
            if (temp.equals("2")) {
                TypesOfWeapons newType = new TypesOfWeapons();
                newType.name = "Огнестрельное";
                pattern.type = newType;
            }
            if (temp.equals("3")) {
                TypesOfWeapons newType = new TypesOfWeapons();
                newType.name = "Холодное";
                pattern.type = newType;
            }
        } else {
            boolean correct = false;
            while (correct) {
                System.out.println("Неправильный ввод");
                System.out.println("Какой тип у оружия ?");
                System.out.println("1.Метательное");
                System.out.println("2.Огнестрельное");
                System.out.println("3.Холодное");
                temp = scanner.next();
                if (temp.equals("1") || temp.equals("2") || temp.equals("3")) {
                    if (temp.equals("1")) {
                        TypesOfWeapons newType = new TypesOfWeapons();
                        newType.name = "Метательное";
                        pattern.type = newType;
                    }
                    if (temp.equals("2")) {
                        TypesOfWeapons newType = new TypesOfWeapons();
                        newType.name = "Огнестрельное";
                        pattern.type = newType;
                    }
                    if (temp.equals("3")) {
                        TypesOfWeapons newType = new TypesOfWeapons();
                        newType.name = "Холодное";
                        pattern.type = newType;
                    }
                    correct = true;
                }
            }
        }
        if (pattern.type.name.equals("Метательное")) {
            System.out.println("Снаряды взрываются с задержкой или без ?");
            System.out.println("1.Без задержки");
            System.out.println("2.С задержкой");
            temp = scanner.next();
            if (temp.equals("1") || temp.equals("2")) {
                if (temp.equals("1")) {
                    Projectiles newProjectiles = new Projectiles("Взрывные снаряды", true, "Взрываются без задержки");
                    pattern.type.haveProjectiles = true;
                    pattern.type.strikingProjectiles = newProjectiles;
                }
                if (temp.equals("2")) {
                    Projectiles newProjectiles = new Projectiles("Взрывные снаряды", true, "Взрываются c задержкой");
                    pattern.type.haveProjectiles = true;
                    pattern.type.strikingProjectiles = newProjectiles;
                } else {
                    boolean correct = false;
                    while (correct) {
                        System.out.println("Снаряды взрываются без задержки или с задержкой ?");
                        System.out.println("1.Без задержки");
                        System.out.println("2.С задержкой");
                        temp = scanner.next();
                        if (temp.equals("1") || temp.equals("2")) {
                            if (temp.equals("1")) {
                                Projectiles newProjectiles = new Projectiles("Взрывные снаряды", true, "Взрываются без задержки");
                                pattern.type.haveProjectiles = true;
                                pattern.type.strikingProjectiles = newProjectiles;
                            }
                            if (temp.equals("2")) {
                                Projectiles newProjectiles = new Projectiles("Взрывные снаряды", true, "Взрываются c задержкой");
                                pattern.type.haveProjectiles = true;
                                pattern.type.strikingProjectiles = newProjectiles;
                            }
                            correct = true;
                        }
                    }
                }


            }

        }
        if (pattern.type.name.equals("Огнестрельное")) {
            System.out.println("Какая скорость стрельбы у оружия ?");
            System.out.println("1.Низкая");
            System.out.println("2.Средняя");
            System.out.println("3.Высокая");
            temp = scanner.next();
            if (temp.equals("1") || temp.equals("2") || temp.equals("3")) {
                if (temp.equals("1")) {
                    pattern.type.rateOfFire = "Низкий";
                }
                if (temp.equals("2")) {
                    pattern.type.rateOfFire = "Средний";
                }
                if (temp.equals("3")) {
                    pattern.type.rateOfFire = "Высокий";
                }
            } else {
                boolean correct = false;
                while (correct) {
                    System.out.println("Неправильный ввод");
                    System.out.println("Какая скорость стрельбы у оружия ?");
                    System.out.println("1.Низкая");
                    System.out.println("2.Средняя");
                    System.out.println("3.Высокая");
                    temp = scanner.next();
                    if (temp.equals("1") || temp.equals("2") || temp.equals("3")) {
                        if (temp.equals("1")) {
                            pattern.type.rateOfFire = "Низкий";
                        }
                        if (temp.equals("2")) {
                            pattern.type.rateOfFire = "Средний";
                        }
                        if (temp.equals("3")) {
                            pattern.type.rateOfFire = "Высокий";
                        }
                        correct = true;
                    }
                }
            }
            System.out.println("Чем поражает оружие?");
            System.out.println("1.Пулями");
            System.out.println("2.Дробью");
            System.out.println("3.Взрывными снарядами");
            temp = scanner.next();
            if (temp.equals("1") || temp.equals("2") || temp.equals("3")) {
                if (temp.equals("1")) {
                    pattern.type.haveProjectiles = true;
                    pattern.type.strikingProjectiles = new Projectiles("Пули", false, null);
                }
                if (temp.equals("2")) {
                    pattern.type.haveProjectiles = true;
                    pattern.type.strikingProjectiles = new Projectiles("Дробь", false, null);
                }
                if (temp.equals("3")) {
                    pattern.type.haveProjectiles = true;
                    pattern.type.strikingProjectiles = new Projectiles("Взрывные снаряды", true, null);
                }
            } else {
                boolean correct = false;
                while (correct) {
                    System.out.println("Неправильный ввод");
                    System.out.println("Чем поражает оружие?");
                    System.out.println("1.Пулями");
                    System.out.println("2.Дробью");
                    System.out.println("3.Взрывными снарядами");
                    temp = scanner.next();
                    if (temp.equals("1") || temp.equals("2") || temp.equals("3")) {
                        if (temp.equals("1")) {
                            pattern.type.haveProjectiles = true;
                            pattern.type.strikingProjectiles = new Projectiles("Пули", false, null);
                        }
                        if (temp.equals("2")) {
                            pattern.type.haveProjectiles = true;
                            pattern.type.strikingProjectiles = new Projectiles("Дробь", false, null);
                        }
                        if (temp.equals("3")) {
                            pattern.type.haveProjectiles = true;
                            pattern.type.strikingProjectiles = new Projectiles("Взрывные снаряды", true, null);
                        }
                        correct = true;
                    }
                }
            }

            if (pattern.type.strikingProjectiles.explosive) {
                System.out.println("Снаряды взрываются с задержкой или без ?");
                System.out.println("1.Без задержки");
                System.out.println("2.С задержкой");
                temp = scanner.next();
                if (temp.equals("1") || temp.equals("2")) {
                    if (temp.equals("1")) {
                        pattern.type.strikingProjectiles.typeOfExplosive = "Взрываются без задержки";
                    }
                    if (temp.equals("2")) {
                        pattern.type.strikingProjectiles.typeOfExplosive = "Взрываются c задержкой";
                    } else {
                        boolean correct = false;
                        while (correct) {
                            System.out.println("Снаряды взрываются без задержки или с задержкой ?");
                            System.out.println("1.Без задержки");
                            System.out.println("2.С задержкой");
                            temp = scanner.next();
                            if (temp.equals("1") || temp.equals("2")) {
                                if (temp.equals("1")) {
                                    pattern.type.strikingProjectiles.typeOfExplosive = "Взрываются без задержки";
                                }
                                if (temp.equals("2")) {
                                    pattern.type.strikingProjectiles.typeOfExplosive = "Взрываются c задержкой";
                                }
                                correct = true;
                            }
                        }

                    }
                }

            }
        }
        for (Weapon weapon : allWeapon) {
            if (weapon.sizeOfWeapon.equals(pattern.sizeOfWeapon)) {
                if (pattern.type.name.equals(weapon.type.name)) {
                    if (pattern.type.haveProjectiles) {
                        if (weapon.type.strikingProjectiles.name.equals(pattern.type.strikingProjectiles.name)) {
                            if (weapon.type.rateOfFire.equals(pattern.type.rateOfFire)) {
                                if (pattern.type.strikingProjectiles.explosive) {
                                    if (pattern.type.strikingProjectiles.typeOfExplosive.equals(weapon.type.strikingProjectiles.typeOfExplosive)) {
                                        pattern.name = weapon.name;
                                        pattern.rangeOfStrike = weapon.rangeOfStrike;
                                        pattern.salvationPlan = weapon.salvationPlan;
                                    }
                                }
                                else {
                                    pattern.name = weapon.name;
                                    pattern.rangeOfStrike = weapon.rangeOfStrike;
                                    pattern.salvationPlan = weapon.salvationPlan;
                                }
                            }
                        }
                    } else {
                        pattern.name = weapon.name;
                        pattern.rangeOfStrike = weapon.rangeOfStrike;
                        pattern.salvationPlan = weapon.salvationPlan;
                    }
                }
            }
        }
        if(pattern.name==null){
            System.out.println("Оружие распознанно не точно. Возможно это один из следующих вариантов:");
            for (Weapon weapon : allWeapon){
                if (pattern.sizeOfWeapon.equals(weapon.sizeOfWeapon))
                    if(pattern.type.name.equals(weapon.type.name)){
                        System.out.println("Оружие:"+weapon.name);
                        System.out.println("План действий:"+weapon.salvationPlan);
                        System.out.println("Дистанция поражения:"+weapon.rangeOfStrike);
                        System.out.println("");
                    }
            }
        }
        else {
            System.out.println("Оружие:" + pattern.name);
            System.out.println("План действий:" + pattern.salvationPlan);
            System.out.println("Дистанция поражения:" + pattern.rangeOfStrike);
        }
    }
}