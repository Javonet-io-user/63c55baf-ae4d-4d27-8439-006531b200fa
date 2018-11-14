package log4net.Core;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Core.*;
import jio.System.*;
import log4net.*;public class LogImpl extends LoggerWrapperImpl implements ILog {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.Boolean getIsDebugEnabled (){ try { return javonetHandle.get("IsDebugEnabled");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getIsInfoEnabled (){ try { return javonetHandle.get("IsInfoEnabled");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getIsWarnEnabled (){ try { return javonetHandle.get("IsWarnEnabled");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getIsErrorEnabled (){ try { return javonetHandle.get("IsErrorEnabled");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getIsFatalEnabled (){ try { return javonetHandle.get("IsFatalEnabled");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public LogImpl (ILogger logger){  super((NObject) null); try {  javonetHandle = Javonet.New("LogImpl",logger); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LogImpl(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Debug (NObject message){ try { javonetHandle.invoke("Debug",message);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Debug (NObject message,jio.System.Exception exception){ try { javonetHandle.invoke("Debug",message,exception);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void DebugFormat (java.lang.String format,NObject[] args){ try { javonetHandle.invoke("DebugFormat",format,new Object[] {args});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void DebugFormat (java.lang.String format,NObject arg0){ try { javonetHandle.invoke("DebugFormat",format,arg0);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void DebugFormat (java.lang.String format,NObject arg0,NObject arg1){ try { javonetHandle.invoke("DebugFormat",format,arg0,arg1);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void DebugFormat (java.lang.String format,NObject arg0,NObject arg1,NObject arg2){ try { javonetHandle.invoke("DebugFormat",format,arg0,arg1,arg2);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void DebugFormat (IFormatProvider provider,java.lang.String format,NObject[] args){ try { javonetHandle.invoke("DebugFormat",provider,format,new Object[] {args});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Info (NObject message){ try { javonetHandle.invoke("Info",message);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Info (NObject message,jio.System.Exception exception){ try { javonetHandle.invoke("Info",message,exception);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void InfoFormat (java.lang.String format,NObject[] args){ try { javonetHandle.invoke("InfoFormat",format,new Object[] {args});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void InfoFormat (java.lang.String format,NObject arg0){ try { javonetHandle.invoke("InfoFormat",format,arg0);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void InfoFormat (java.lang.String format,NObject arg0,NObject arg1){ try { javonetHandle.invoke("InfoFormat",format,arg0,arg1);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void InfoFormat (java.lang.String format,NObject arg0,NObject arg1,NObject arg2){ try { javonetHandle.invoke("InfoFormat",format,arg0,arg1,arg2);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void InfoFormat (IFormatProvider provider,java.lang.String format,NObject[] args){ try { javonetHandle.invoke("InfoFormat",provider,format,new Object[] {args});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Warn (NObject message){ try { javonetHandle.invoke("Warn",message);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Warn (NObject message,jio.System.Exception exception){ try { javonetHandle.invoke("Warn",message,exception);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void WarnFormat (java.lang.String format,NObject[] args){ try { javonetHandle.invoke("WarnFormat",format,new Object[] {args});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void WarnFormat (java.lang.String format,NObject arg0){ try { javonetHandle.invoke("WarnFormat",format,arg0);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void WarnFormat (java.lang.String format,NObject arg0,NObject arg1){ try { javonetHandle.invoke("WarnFormat",format,arg0,arg1);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void WarnFormat (java.lang.String format,NObject arg0,NObject arg1,NObject arg2){ try { javonetHandle.invoke("WarnFormat",format,arg0,arg1,arg2);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void WarnFormat (IFormatProvider provider,java.lang.String format,NObject[] args){ try { javonetHandle.invoke("WarnFormat",provider,format,new Object[] {args});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Error (NObject message){ try { javonetHandle.invoke("Error",message);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Error (NObject message,jio.System.Exception exception){ try { javonetHandle.invoke("Error",message,exception);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void ErrorFormat (java.lang.String format,NObject[] args){ try { javonetHandle.invoke("ErrorFormat",format,new Object[] {args});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void ErrorFormat (java.lang.String format,NObject arg0){ try { javonetHandle.invoke("ErrorFormat",format,arg0);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void ErrorFormat (java.lang.String format,NObject arg0,NObject arg1){ try { javonetHandle.invoke("ErrorFormat",format,arg0,arg1);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void ErrorFormat (java.lang.String format,NObject arg0,NObject arg1,NObject arg2){ try { javonetHandle.invoke("ErrorFormat",format,arg0,arg1,arg2);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void ErrorFormat (IFormatProvider provider,java.lang.String format,NObject[] args){ try { javonetHandle.invoke("ErrorFormat",provider,format,new Object[] {args});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Fatal (NObject message){ try { javonetHandle.invoke("Fatal",message);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Fatal (NObject message,jio.System.Exception exception){ try { javonetHandle.invoke("Fatal",message,exception);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void FatalFormat (java.lang.String format,NObject[] args){ try { javonetHandle.invoke("FatalFormat",format,new Object[] {args});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void FatalFormat (java.lang.String format,NObject arg0){ try { javonetHandle.invoke("FatalFormat",format,arg0);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void FatalFormat (java.lang.String format,NObject arg0,NObject arg1){ try { javonetHandle.invoke("FatalFormat",format,arg0,arg1);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void FatalFormat (java.lang.String format,NObject arg0,NObject arg1,NObject arg2){ try { javonetHandle.invoke("FatalFormat",format,arg0,arg1,arg2);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void FatalFormat (IFormatProvider provider,java.lang.String format,NObject[] args){ try { javonetHandle.invoke("FatalFormat",provider,format,new Object[] {args});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}