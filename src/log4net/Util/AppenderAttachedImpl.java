package log4net.Util;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Util.*;
import log4net.Core.*;
import log4net.Appender.*;public class AppenderAttachedImpl implements IAppenderAttachable {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public AppenderCollection getAppenders (){ try { return new AppenderCollection((NObject)javonetHandle.get("Appenders"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public AppenderAttachedImpl (){ try {  javonetHandle = Javonet.New("AppenderAttachedImpl");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public AppenderAttachedImpl(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Integer AppendLoopOnAppenders (LoggingEvent loggingEvent){ try { return javonetHandle.invoke("AppendLoopOnAppenders",loggingEvent);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Integer AppendLoopOnAppenders (LoggingEvent[] loggingEvents){ try { return javonetHandle.invoke("AppendLoopOnAppenders",new Object[] {loggingEvents});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
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
            public IAppender RemoveAppender (java.lang.String name){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("RemoveAppender",name));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}