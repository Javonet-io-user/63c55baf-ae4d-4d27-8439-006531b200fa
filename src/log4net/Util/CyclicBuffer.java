package log4net.Util;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Util.*;
import log4net.Core.*;public class CyclicBuffer {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public LoggingEvent get_Item (java.lang.Integer i){ try { return new LoggingEvent((NObject)javonetHandle.invoke("get_Item",i));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getMaxSize (){ try { return javonetHandle.get("MaxSize");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getLength (){ try { return javonetHandle.get("Length");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }public CyclicBuffer (java.lang.Integer maxSize){ try {  javonetHandle = Javonet.New("CyclicBuffer",maxSize);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CyclicBuffer(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public LoggingEvent Append (LoggingEvent loggingEvent){ try { return new LoggingEvent((NObject)javonetHandle.invoke("Append",loggingEvent));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public LoggingEvent PopOldest (){ try { return new LoggingEvent((NObject)javonetHandle.invoke("PopOldest"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public LoggingEvent[] PopAll (){ try { return Helper.ConvertNObjectToDestinationType((NObject[])javonetHandle.invoke("PopAll"),LoggingEvent[].class);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void Clear (){ try { javonetHandle.invoke("Clear");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}