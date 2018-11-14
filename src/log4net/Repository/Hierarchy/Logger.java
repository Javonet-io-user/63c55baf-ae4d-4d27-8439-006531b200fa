package log4net.Repository.Hierarchy;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Repository.Hierarchy.*;
import log4net.Appender.*;
import jio.System.*;
import log4net.Core.*;
import log4net.Repository.*;public abstract class Logger implements IAppenderAttachable,ILogger {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setParent (Logger value){ try { javonetHandle.set("Parent",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Logger getParent (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("Parent"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setAdditivity (java.lang.Boolean value){ try { javonetHandle.set("Additivity",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getAdditivity (){ try { return javonetHandle.get("Additivity");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public Level getEffectiveLevel (){ try { return new Level((NObject)javonetHandle.get("EffectiveLevel"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setHierarchy (Hierarchy value){ try { javonetHandle.set("Hierarchy",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Hierarchy getHierarchy (){ try { return new Hierarchy((NObject)javonetHandle.get("Hierarchy"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setLevel (Level value){ try { javonetHandle.set("Level",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Level getLevel (){ try { return new Level((NObject)javonetHandle.get("Level"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public AppenderCollection getAppenders (){ try { return new AppenderCollection((NObject)javonetHandle.get("Appenders"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.String getName (){ try { return  (java.lang.String) javonetHandle.get("Name");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public ILoggerRepository getRepository (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("Repository"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public Logger(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void AddAppender (IAppender newAppender){ try { javonetHandle.invoke("AddAppender",newAppender);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public IAppender GetAppender (java.lang.String name){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetAppender",name));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void RemoveAllAppenders (){ try { javonetHandle.invoke("RemoveAllAppenders");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public IAppender RemoveAppender (IAppender appender){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("RemoveAppender",appender));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public IAppender RemoveAppender (java.lang.String name){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("RemoveAppender",name));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void Log (Class callerStackBoundaryDeclaringType,Level level,NObject message,jio.System.Exception exception){ try { javonetHandle.invoke("Log",Javonet.getType(getReturnObjectName(callerStackBoundaryDeclaringType).getTypeName()),level,message,exception);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Log (LoggingEvent logEvent){ try { javonetHandle.invoke("Log",logEvent);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean IsEnabledFor (Level level){ try { return javonetHandle.invoke("IsEnabledFor",level);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public void CloseNestedAppenders (){ try { javonetHandle.invoke("CloseNestedAppenders");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Log (Level level,NObject message,jio.System.Exception exception){ try { javonetHandle.invoke("Log",level,message,exception);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}