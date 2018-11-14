package log4net.Plugin;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Plugin.*;
import log4net.Repository.*;public class PluginMap {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public IPlugin get_Item (java.lang.String name){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("get_Item",name));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PluginCollection getAllPlugins (){ try { return new PluginCollection((NObject)javonetHandle.get("AllPlugins"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PluginMap (ILoggerRepository repository){ try {  javonetHandle = Javonet.New("PluginMap",repository);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PluginMap(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Add (IPlugin plugin){ try { javonetHandle.invoke("Add",plugin);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Remove (IPlugin plugin){ try { javonetHandle.invoke("Remove",plugin);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}