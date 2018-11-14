package log4net.Core;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Core.*;
import jio.System.Runtime.Serialization.*;
import jio.System.IO.*;
import jio.System.*;
import log4net.Util.*;
import log4net.Repository.*;public class LoggingEvent implements ISerializable {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public static java.util.Date getStartTime (){ try { return Javonet.getType("LoggingEvent").get("StartTime");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public Level getLevel (){ try { return new Level((NObject)javonetHandle.get("Level"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.util.Date getTimeStamp (){ try { return javonetHandle.get("TimeStamp");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.String getLoggerName (){ try { return  (java.lang.String) javonetHandle.get("LoggerName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public LocationInfo getLocationInformation (){ try { return new LocationInfo((NObject)javonetHandle.get("LocationInformation"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public NObject getMessageObject (){ try { return  (NObject) javonetHandle.get("MessageObject");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public jio.System.Exception getExceptionObject (){ try { return  (jio.System.Exception) javonetHandle.get("ExceptionObject");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public ILoggerRepository getRepository (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("Repository"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.String getRenderedMessage (){ try { return  (java.lang.String) javonetHandle.get("RenderedMessage");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getThreadName (){ try { return  (java.lang.String) javonetHandle.get("ThreadName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getUserName (){ try { return  (java.lang.String) javonetHandle.get("UserName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getIdentity (){ try { return  (java.lang.String) javonetHandle.get("Identity");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getDomain (){ try { return  (java.lang.String) javonetHandle.get("Domain");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public PropertiesDictionary getProperties (){ try { return new PropertiesDictionary((NObject)javonetHandle.get("Properties"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setFix (FixFlags value){ try { javonetHandle.set("Fix",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public FixFlags getFix (){ try { return FixFlags.valueOf(((NEnum) javonetHandle.get("Fix")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetFiled
	 */
            public static java.lang.String getHostNameProperty (){ try { return  (java.lang.String) Javonet.getType("LoggingEvent").get("HostNameProperty");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public static void setHostNameProperty (java.lang.String param){ try { Javonet.getType("LoggingEvent").set("HostNameProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static java.lang.String getIdentityProperty (){ try { return  (java.lang.String) Javonet.getType("LoggingEvent").get("IdentityProperty");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public static void setIdentityProperty (java.lang.String param){ try { Javonet.getType("LoggingEvent").set("IdentityProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static java.lang.String getUserNameProperty (){ try { return  (java.lang.String) Javonet.getType("LoggingEvent").get("UserNameProperty");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public static void setUserNameProperty (java.lang.String param){ try { Javonet.getType("LoggingEvent").set("UserNameProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LoggingEvent (Class callerStackBoundaryDeclaringType,ILoggerRepository repository,java.lang.String loggerName,Level level,NObject message,jio.System.Exception exception){ try {  javonetHandle = Javonet.New("LoggingEvent",Javonet.getType(getReturnObjectName(callerStackBoundaryDeclaringType).getTypeName()),repository,loggerName,level,message,exception);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LoggingEvent (Class callerStackBoundaryDeclaringType,ILoggerRepository repository,LoggingEventData data,FixFlags fixedData){ try {  javonetHandle = Javonet.New("LoggingEvent",Javonet.getType(getReturnObjectName(callerStackBoundaryDeclaringType).getTypeName()),repository,data,NEnum.fromJavaEnum(fixedData));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LoggingEvent (Class callerStackBoundaryDeclaringType,ILoggerRepository repository,LoggingEventData data){ try {  javonetHandle = Javonet.New("LoggingEvent",Javonet.getType(getReturnObjectName(callerStackBoundaryDeclaringType).getTypeName()),repository,data);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LoggingEvent (LoggingEventData data){ try {  javonetHandle = Javonet.New("LoggingEvent",data);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LoggingEvent(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void GetObjectData (SerializationInfo info,StreamingContext context){ try { javonetHandle.invoke("GetObjectData",info,context);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void WriteRenderedMessage (TextWriter writer){ try { javonetHandle.invoke("WriteRenderedMessage",writer);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public LoggingEventData GetLoggingEventData (){ try { return javonetHandle.invoke("GetLoggingEventData");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public LoggingEventData GetLoggingEventData (FixFlags fixFlags){ try { return javonetHandle.invoke("GetLoggingEventData",NEnum.fromJavaEnum(fixFlags));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.String GetExceptionStrRep (){ try { return  (java.lang.String) javonetHandle.invoke("GetExceptionStrRep");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public java.lang.String GetExceptionString (){ try { return  (java.lang.String) javonetHandle.invoke("GetExceptionString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public void FixVolatileData (){ try { javonetHandle.invoke("FixVolatileData");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void FixVolatileData (java.lang.Boolean fastButLoose){ try { javonetHandle.invoke("FixVolatileData",fastButLoose);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public NObject LookupProperty (java.lang.String key){ try { return  (NObject) javonetHandle.invoke("LookupProperty",key);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public PropertiesDictionary GetProperties (){ try { return new PropertiesDictionary((NObject)javonetHandle.invoke("GetProperties"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}