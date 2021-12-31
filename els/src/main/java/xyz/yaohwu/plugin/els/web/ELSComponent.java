package xyz.yaohwu.plugin.els.web;

import com.fr.web.struct.Component;
import com.fr.web.struct.browser.RequestClient;
import com.fr.web.struct.category.ScriptPath;

/**
 * @author yaohwu
 * created by yaohwu at 2021/6/27 11:28 上午
 */
public class ELSComponent extends Component {
    public static final ELSComponent KEY = new ELSComponent();

    private ELSComponent() {
    }

    @Override
    public ScriptPath script(RequestClient req) {
        return ScriptPath.build("xyz/yaohwu/plugin/els/els.main.js");
    }

}
