package log4net.Appender;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Appender.*;
import log4net.Core.*;public abstract class BufferingAppenderSkeleton extends AppenderSkeleton implements IOptionHandler {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setLossy (java.lang.Boolean value){ try { javonetHandle.set("Lossy",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getLossy (){ try { return javonetHandle.get("Lossy");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setBufferSize (java.lang.Integer value){ try { javonetHandle.set("BufferSize",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getBufferSize (){ try { return javonetHandle.get("BufferSize");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setEvaluator (ITriggeringEventEvaluator value){ try { javonetHandle.set("Evaluator",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public ITriggeringEventEvaluator getEvaluator (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("Evaluator"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setLossyEvaluator (ITriggeringEventEvaluator value){ try { javonetHandle.set("LossyEvaluator",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public ITriggeringEventEvaluator getLossyEvaluator (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("LossyEvaluator"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setOnlyFixPartialEventData (java.lang.Boolean value){ try { javonetHandle.set("OnlyFixPartialEventData",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getOnlyFixPartialEventData (){ try { return javonetHandle.get("OnlyFixPartialEventData");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setFix (FixFlags value){ try { javonetHandle.set("Fix",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public FixFlags getFix (){ try { return FixFlags.valueOf(((NEnum) javonetHandle.get("Fix")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public BufferingAppenderSkeleton(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void ActivateOptions (){ try { javonetHandle.invoke("ActivateOptions");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Flush (){ try { javonetHandle.invoke("Flush");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Flush (java.lang.Boolean flushLossyBuffer){ try { javonetHandle.invoke("Flush",flushLossyBuffer);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}