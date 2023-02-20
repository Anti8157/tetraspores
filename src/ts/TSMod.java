package ts;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import ts.content.*;

public class TSMod extends Mod{


    @Override
    public void loadContent(){
        TSFactories.load();
    }

}
