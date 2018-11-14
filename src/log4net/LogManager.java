package log4net;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.*;
import jio.System.Reflection.*;
import jio.System.*;
import log4net.Repository.*;public class LogManager {protected NObject javonetHandle; public LogManager(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public static ILog Exists (java.lang.String name){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LogManager").invoke("Exists",name));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILog Exists (java.lang.String repository,java.lang.String name){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LogManager").invoke("Exists",repository,name));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILog Exists (Assembly repositoryAssembly,java.lang.String name){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LogManager").invoke("Exists",repositoryAssembly,name));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILog[] GetCurrentLoggers (){ try { return Helper.ConvertNObjectToDestinationType((NObject[])Javonet.getType("LogManager").invoke("GetCurrentLoggers"),ILog[].class);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILog[] GetCurrentLoggers (java.lang.String repository){ try { return Helper.ConvertNObjectToDestinationType((NObject[])Javonet.getType("LogManager").invoke("GetCurrentLoggers",repository),ILog[].class);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILog[] GetCurrentLoggers (Assembly repositoryAssembly){ try { return Helper.ConvertNObjectToDestinationType((NObject[])Javonet.getType("LogManager").invoke("GetCurrentLoggers",repositoryAssembly),ILog[].class);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILog GetLogger (java.lang.String name){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LogManager").invoke("GetLogger",name));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILog GetLogger (java.lang.String repository,java.lang.String name){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LogManager").invoke("GetLogger",repository,name));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILog GetLogger (Assembly repositoryAssembly,java.lang.String name){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LogManager").invoke("GetLogger",repositoryAssembly,name));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILog GetLogger (Class type){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LogManager").invoke("GetLogger",Javonet.getType(getReturnObjectName(type).getTypeName())));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILog GetLogger (java.lang.String repository,Class type){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LogManager").invoke("GetLogger",repository,Javonet.getType(getReturnObjectName(type).getTypeName())));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILog GetLogger (Assembly repositoryAssembly,Class type){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LogManager").invoke("GetLogger",repositoryAssembly,Javonet.getType(getReturnObjectName(type).getTypeName())));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static void Shutdown (){ try { Javonet.getType("LogManager").invoke("Shutdown");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static void ShutdownRepository (){ try { Javonet.getType("LogManager").invoke("ShutdownRepository");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static void ShutdownRepository (java.lang.String repository){ try { Javonet.getType("LogManager").invoke("ShutdownRepository",repository);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static void ShutdownRepository (Assembly repositoryAssembly){ try { Javonet.getType("LogManager").invoke("ShutdownRepository",repositoryAssembly);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static void ResetConfiguration (){ try { Javonet.getType("LogManager").invoke("ResetConfiguration");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static void ResetConfiguration (java.lang.String repository){ try { Javonet.getType("LogManager").invoke("ResetConfiguration",repository);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static void ResetConfiguration (Assembly repositoryAssembly){ try { Javonet.getType("LogManager").invoke("ResetConfiguration",repositoryAssembly);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static ILoggerRepository GetLoggerRepository (){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LogManager").invoke("GetLoggerRepository"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILoggerRepository GetLoggerRepository (java.lang.String repository){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LogManager").invoke("GetLoggerRepository",repository));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILoggerRepository GetLoggerRepository (Assembly repositoryAssembly){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LogManager").invoke("GetLoggerRepository",repositoryAssembly));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILoggerRepository GetRepository (){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LogManager").invoke("GetRepository"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILoggerRepository GetRepository (java.lang.String repository){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LogManager").invoke("GetRepository",repository));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILoggerRepository GetRepository (Assembly repositoryAssembly){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LogManager").invoke("GetRepository",repositoryAssembly));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILoggerRepository CreateDomain (Class repositoryType){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LogManager").invoke("CreateDomain",Javonet.getType(getReturnObjectName(repositoryType).getTypeName())));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILoggerRepository CreateRepository (Class repositoryType){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LogManager").invoke("CreateRepository",Javonet.getType(getReturnObjectName(repositoryType).getTypeName())));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILoggerRepository CreateDomain (java.lang.String repository){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LogManager").invoke("CreateDomain",repository));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILoggerRepository CreateRepository (java.lang.String repository){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LogManager").invoke("CreateRepository",repository));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILoggerRepository CreateDomain (java.lang.String repository,Class repositoryType){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LogManager").invoke("CreateDomain",repository,Javonet.getType(getReturnObjectName(repositoryType).getTypeName())));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILoggerRepository CreateRepository (java.lang.String repository,Class repositoryType){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LogManager").invoke("CreateRepository",repository,Javonet.getType(getReturnObjectName(repositoryType).getTypeName())));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILoggerRepository CreateDomain (Assembly repositoryAssembly,Class repositoryType){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LogManager").invoke("CreateDomain",repositoryAssembly,Javonet.getType(getReturnObjectName(repositoryType).getTypeName())));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILoggerRepository CreateRepository (Assembly repositoryAssembly,Class repositoryType){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("LogManager").invoke("CreateRepository",repositoryAssembly,Javonet.getType(getReturnObjectName(repositoryType).getTypeName())));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static ILoggerRepository[] GetAllRepositories (){ try { return Helper.ConvertNObjectToDestinationType((NObject[])Javonet.getType("LogManager").invoke("GetAllRepositories"),ILoggerRepository[].class);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}