package log4net.Plugin;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Plugin.*;
import log4net.Repository.*;public class RemoteLoggingServerPlugin extends PluginSkeleton implements IPlugin {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setSinkUri (java.lang.String value){ try { javonetHandle.set("SinkUri",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSinkUri (){ try { return  (java.lang.String) javonetHandle.get("SinkUri");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public RemoteLoggingServerPlugin (){  super((NObject) null); try {  javonetHandle = Javonet.New("RemoteLoggingServerPlugin"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public RemoteLoggingServerPlugin (java.lang.String sinkUri){  super((NObject) null); try {  javonetHandle = Javonet.New("RemoteLoggingServerPlugin",sinkUri); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public RemoteLoggingServerPlugin(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Attach (ILoggerRepository repository){ try { javonetHandle.invoke("Attach",repository);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Shutdown (){ try { javonetHandle.invoke("Shutdown");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}