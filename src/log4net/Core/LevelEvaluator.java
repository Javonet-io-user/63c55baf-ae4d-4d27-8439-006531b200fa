package log4net.Core;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Core.*;public class LevelEvaluator implements ITriggeringEventEvaluator {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setThreshold (Level value){ try { javonetHandle.set("Threshold",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Level getThreshold (){ try { return new Level((NObject)javonetHandle.get("Threshold"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public LevelEvaluator (){ try {  javonetHandle = Javonet.New("LevelEvaluator");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LevelEvaluator (Level threshold){ try {  javonetHandle = Javonet.New("LevelEvaluator",threshold);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LevelEvaluator(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Boolean IsTriggeringEvent (LoggingEvent loggingEvent){ try { return javonetHandle.invoke("IsTriggeringEvent",loggingEvent);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}