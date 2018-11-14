package log4net.Appender;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Appender.*;
import jio.System.Text.*;
import log4net.Core.*;
import log4net.Layout.*;public class FileAppender extends TextWriterAppender implements IOptionHandler {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setFile (java.lang.String value){ try { javonetHandle.set("File",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getFile (){ try { return  (java.lang.String) javonetHandle.get("File");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setAppendToFile (java.lang.Boolean value){ try { javonetHandle.set("AppendToFile",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getAppendToFile (){ try { return javonetHandle.get("AppendToFile");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setEncoding (Encoding value){ try { javonetHandle.set("Encoding",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Encoding getEncoding (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("Encoding"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSecurityContext (SecurityContext value){ try { javonetHandle.set("SecurityContext",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public SecurityContext getSecurityContext (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("SecurityContext"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setLockingModel (LockingModelBase value){ try { javonetHandle.set("LockingModel",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LockingModelBase getLockingModel (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("LockingModel"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public FileAppender (){  super((NObject) null); try {  javonetHandle = Javonet.New("FileAppender"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public FileAppender (ILayout layout,java.lang.String filename,java.lang.Boolean append){  super((NObject) null); try {  javonetHandle = Javonet.New("FileAppender",layout,filename,append); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public FileAppender (ILayout layout,java.lang.String filename){  super((NObject) null); try {  javonetHandle = Javonet.New("FileAppender",layout,filename); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public FileAppender(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void ActivateOptions (){ try { javonetHandle.invoke("ActivateOptions");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public static abstract class LockingModelBase {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setCurrentAppender (FileAppender value){ try { javonetHandle.set("CurrentAppender",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public FileAppender getCurrentAppender (){ try { return new FileAppender((NObject)javonetHandle.get("CurrentAppender"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public LockingModelBase(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void OpenFile (java.lang.String filename,java.lang.Boolean append,Encoding encoding){ try { javonetHandle.invoke("OpenFile",filename,append,encoding);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void CloseFile (){ try { javonetHandle.invoke("CloseFile");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public Stream AcquireLock (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("AcquireLock"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void ReleaseLock (){ try { javonetHandle.invoke("ReleaseLock");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }}public static class ExclusiveLock extends LockingModelBase {protected NObject javonetHandle; public ExclusiveLock (){  super((NObject) null); try {  javonetHandle = Javonet.New("ExclusiveLock"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ExclusiveLock(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void OpenFile (java.lang.String filename,java.lang.Boolean append,Encoding encoding){ try { javonetHandle.invoke("OpenFile",filename,append,encoding);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void CloseFile (){ try { javonetHandle.invoke("CloseFile");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public Stream AcquireLock (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("AcquireLock"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void ReleaseLock (){ try { javonetHandle.invoke("ReleaseLock");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }}public static class MinimalLock extends LockingModelBase {protected NObject javonetHandle; public MinimalLock (){  super((NObject) null); try {  javonetHandle = Javonet.New("MinimalLock"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public MinimalLock(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void OpenFile (java.lang.String filename,java.lang.Boolean append,Encoding encoding){ try { javonetHandle.invoke("OpenFile",filename,append,encoding);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void CloseFile (){ try { javonetHandle.invoke("CloseFile");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public Stream AcquireLock (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("AcquireLock"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void ReleaseLock (){ try { javonetHandle.invoke("ReleaseLock");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }}	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}