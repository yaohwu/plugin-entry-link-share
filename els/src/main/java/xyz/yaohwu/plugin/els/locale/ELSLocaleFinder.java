package xyz.yaohwu.plugin.els.locale;

import com.fr.plugin.transform.FunctionRecorder;
import com.fr.stable.fun.impl.AbstractLocaleFinder;

@FunctionRecorder
public class ELSLocaleFinder extends AbstractLocaleFinder {

    @Override
    public String find() {
        return "xyz/yaohwu/plugin/els/locale/els";
    }
}
