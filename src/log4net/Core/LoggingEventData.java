package log4net.Core;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import log4net.Core.*;
import log4net.Util.*;public class LoggingEventData extends ValueType {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public java.lang.String getLoggerName (){ try { return  (java.lang.String) javonetHandle.get("LoggerName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setLoggerName (java.lang.String param){ try { javonetHandle.set("LoggerName",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public Level getLevel (){ try { return new Level((NObject)javonetHandle.get("Level"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setLevel (Level param){ try { javonetHandle.set("Level",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getMessage (){ try { return  (java.lang.String) javonetHandle.get("Message");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setMessage (java.lang.String param){ try { javonetHandle.set("Message",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getThreadName (){ try { return  (java.lang.String) javonetHandle.get("ThreadName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setThreadName (java.lang.String param){ try { javonetHandle.set("ThreadName",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.util.Date getTimeStamp (){ try { return javonetHandle.get("TimeStamp");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setTimeStamp (java.util.Date param){ try { javonetHandle.set("TimeStamp",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public LocationInfo getLocationInfo (){ try { return new LocationInfo((NObject)javonetHandle.get("LocationInfo"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setLocationInfo (LocationInfo param){ try { javonetHandle.set("LocationInfo",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getUserName (){ try { return  (java.lang.String) javonetHandle.get("UserName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setUserName (java.lang.String param){ try { javonetHandle.set("UserName",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getIdentity (){ try { return  (java.lang.String) javonetHandle.get("Identity");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setIdentity (java.lang.String param){ try { javonetHandle.set("Identity",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getExceptionString (){ try { return  (java.lang.String) javonetHandle.get("ExceptionString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setExceptionString (java.lang.String param){ try { javonetHandle.set("ExceptionString",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getDomain (){ try { return  (java.lang.String) javonetHandle.get("Domain");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setDomain (java.lang.String param){ try { javonetHandle.set("Domain",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public PropertiesDictionary getProperties (){ try { return new PropertiesDictionary((NObject)javonetHandle.get("Properties"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setProperties (PropertiesDictionary param){ try { javonetHandle.set("Properties",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LoggingEventData(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}