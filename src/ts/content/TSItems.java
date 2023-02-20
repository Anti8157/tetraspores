package ts.content;

import arc.graphics.*;
import mindustry.type.*;

public class TSItems{
    public static Item
            iron, aluminum;

    public static void load(){
        iron = new Item("iron", Color.valueOf("9d8e8e")){{
            explosiveness = 0f;
            flammability = 0f;
            radioactivity = 0f;
            charge = 0f;

            alwaysUnlocked = true;
            hardness = 2;
            cost = 1f;
        }};
        aluminum = new Item("aluminum", Color.valueOf("d0d0e0")){{
            explosiveness = 0f;
            flammability = 0f;
            radioactivity = 0f;
            charge = 0f;

            alwaysUnlocked = true;
            hardness = 2;
            cost = 1f;
        }};
    }
}