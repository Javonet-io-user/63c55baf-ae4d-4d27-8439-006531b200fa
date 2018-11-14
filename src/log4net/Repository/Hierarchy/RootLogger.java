package log4net.Repository.Hierarchy;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Repository.Hierarchy.*;
import log4net.Core.*;public class RootLogger extends Logger {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public Level getRootLoggerRootLoggerEffectiveLevel (){ try { return new Level((NObject)javonetHandle.get("RootLoggerRootLoggerEffectiveLevel"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setget_RootLoggerRootLoggerLevel (Level value){ try { javonetHandle.set("get_RootLoggerRootLoggerLevel",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Level getRootLoggerRootLoggerLevel (){ try { return new Level((NObject)javonetHandle.get("RootLoggerRootLoggerLevel"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public RootLogger (Level level){  super((NObject) null); try {  javonetHandle = Javonet.New("RootLogger",level); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public RootLogger(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}