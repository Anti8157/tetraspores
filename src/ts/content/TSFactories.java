package ts.content;

import arc.graphics.*;
import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.content.Liquids;
import mindustry.type.*;
import mindustry.world.Block;
import mindustry.world.blocks.production.AttributeCrafter;
import mindustry.world.draw.*;
import mindustry.world.meta.Attribute;
import mindustry.world.meta.Env;
import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;

public class TSFactories{
    public static Block
            bioLab;

    public static void load(){
        bioLab = new AttributeCrafter("bio-lab"){{
            requirements(Category.production, with(Items.copper, 50, Items.lead, 50, Items.silicon, 75, Items.plastanium, 15 ));
            outputItem = new ItemStack(Items.sporePod, 5);
            craftTime = 300;
            size = 3;
            hasLiquids = true;
            hasPower = true;
            hasItems = true;
            health = 400;

            craftEffect = Fx.none;
            envRequired |= Env.spores;
            attribute = Attribute.spores;

            legacyReadWarmup = true;
            drawer = new DrawMulti(
                    new DrawRegion("-bottom"),
                    new DrawLiquidTile(Liquids.water),
                    new DrawDefault(),
                    new DrawCultivator(),
                    new DrawRegion("-top")
            );
            maxBoost = 2f;

            consumePower(160f / 60f);
            consumeLiquid(Liquids.water, 24f / 60f);
            consumeItem(Items.coal, 2);
        }};
    }
}