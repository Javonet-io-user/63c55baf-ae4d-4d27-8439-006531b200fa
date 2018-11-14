package log4net.Core;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Core.*;
import log4net.Repository.*;
import jio.System.Reflection.*;
import jio.System.*;public class LoggerManager {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public static void setRepositorySelector (IRepositorySelector value){ try { Javonet.getType("LoggerManager").set("RepositorySelector",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public static IRepositorySelector getRepositorySelector (){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LoggerManager").get("RepositorySelector"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public LoggerManager(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public static ILoggerRepository GetLoggerRepository (java.lang.String repository){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LoggerManager").invoke("GetLoggerRepository",repository));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILoggerRepository GetLoggerRepository (Assembly repositoryAssembly){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LoggerManager").invoke("GetLoggerRepository",repositoryAssembly));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILoggerRepository GetRepository (java.lang.String repository){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LoggerManager").invoke("GetRepository",repository));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILoggerRepository GetRepository (Assembly repositoryAssembly){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LoggerManager").invoke("GetRepository",repositoryAssembly));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILogger Exists (java.lang.String repository,java.lang.String name){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LoggerManager").invoke("Exists",repository,name));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILogger Exists (Assembly repositoryAssembly,java.lang.String name){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LoggerManager").invoke("Exists",repositoryAssembly,name));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILogger[] GetCurrentLoggers (java.lang.String repository){ try { return Helper.ConvertNObjectToDestinationType((NObject[])Javonet.getType("LoggerManager").invoke("GetCurrentLoggers",repository),ILogger[].class);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILogger[] GetCurrentLoggers (Assembly repositoryAssembly){ try { return Helper.ConvertNObjectToDestinationType((NObject[])Javonet.getType("LoggerManager").invoke("GetCurrentLoggers",repositoryAssembly),ILogger[].class);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILogger GetLogger (java.lang.String repository,java.lang.String name){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LoggerManager").invoke("GetLogger",repository,name));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILogger GetLogger (Assembly repositoryAssembly,java.lang.String name){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LoggerManager").invoke("GetLogger",repositoryAssembly,name));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILogger GetLogger (java.lang.String repository,Class type){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LoggerManager").invoke("GetLogger",repository,Javonet.getType(getReturnObjectName(type).getTypeName())));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILogger GetLogger (Assembly repositoryAssembly,Class type){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LoggerManager").invoke("GetLogger",repositoryAssembly,Javonet.getType(getReturnObjectName(type).getTypeName())));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static void Shutdown (){ try { Javonet.getType("LoggerManager").invoke("Shutdown");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static void ShutdownRepository (java.lang.String repository){ try { Javonet.getType("LoggerManager").invoke("ShutdownRepository",repository);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static void ShutdownRepository (Assembly repositoryAssembly){ try { Javonet.getType("LoggerManager").invoke("ShutdownRepository",repositoryAssembly);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static void ResetConfiguration (java.lang.String repository){ try { Javonet.getType("LoggerManager").invoke("ResetConfiguration",repository);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static void ResetConfiguration (Assembly repositoryAssembly){ try { Javonet.getType("LoggerManager").invoke("ResetConfiguration",repositoryAssembly);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static ILoggerRepository CreateDomain (java.lang.String repository){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LoggerManager").invoke("CreateDomain",repository));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILoggerRepository CreateRepository (java.lang.String repository){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LoggerManager").invoke("CreateRepository",repository));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILoggerRepository CreateDomain (java.lang.String repository,Class repositoryType){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LoggerManager").invoke("CreateDomain",repository,Javonet.getType(getReturnObjectName(repositoryType).getTypeName())));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILoggerRepository CreateRepository (java.lang.String repository,Class repositoryType){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LoggerManager").invoke("CreateRepository",repository,Javonet.getType(getReturnObjectName(repositoryType).getTypeName())));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILoggerRepository CreateDomain (Assembly repositoryAssembly,Class repositoryType){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LoggerManager").invoke("CreateDomain",repositoryAssembly,Javonet.getType(getReturnObjectName(repositoryType).getTypeName())));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILoggerRepository CreateRepository (Assembly repositoryAssembly,Class repositoryType){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LoggerManager").invoke("CreateRepository",repositoryAssembly,Javonet.getType(getReturnObjectName(repositoryType).getTypeName())));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILoggerRepository[] GetAllRepositories (){ try { return Helper.ConvertNObjectToDestinationType((NObject[])Javonet.getType("LoggerManager").invoke("GetAllRepositories"),ILoggerRepository[].class);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}