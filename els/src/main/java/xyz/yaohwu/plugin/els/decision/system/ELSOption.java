package xyz.yaohwu.plugin.els.decision.system;

import com.fr.decision.fun.impl.AbstractSystemOptionProvider;
import com.fr.decision.web.MainComponent;
import com.fr.web.struct.Atom;
import xyz.yaohwu.plugin.els.web.ELSComponent;

import static xyz.yaohwu.plugin.els.Constants.DEC_MANAGEMENT_MAINTENANCE_ELS_ID;
import static xyz.yaohwu.plugin.els.Constants.DEC_MANAGEMENT_MAINTENANCE_ELS_INDEX;

public class ELSOption extends AbstractSystemOptionProvider {

    @Override
    public String id() {
        return DEC_MANAGEMENT_MAINTENANCE_ELS_ID;
    }

    @Override
    public String displayName() {
        return "xyz-yaohwu-els-main";
    }

    @Override
    public int sortIndex() {
        return DEC_MANAGEMENT_MAINTENANCE_ELS_INDEX;
    }


    @Override
    public Atom attach() {
        return MainComponent.KEY;
    }

    @Override
    public Atom client() {
        return ELSComponent.KEY;
    }
}
