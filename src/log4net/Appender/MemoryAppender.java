package log4net.Appender;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Appender.*;
import log4net.Core.*;public class MemoryAppender extends AppenderSkeleton {protected NObject javonetHandle; /**
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
            public FixFlags getFix (){ try { return FixFlags.valueOf(((NEnum) javonetHandle.get("Fix")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public MemoryAppender (){  super((NObject) null); try {  javonetHandle = Javonet.New("MemoryAppender"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public MemoryAppender(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public LoggingEvent[] GetEvents (){ try { return Helper.ConvertNObjectToDestinationType((NObject[])javonetHandle.invoke("GetEvents"),LoggingEvent[].class);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void Clear (){ try { javonetHandle.invoke("Clear");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}