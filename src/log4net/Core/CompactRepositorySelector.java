package log4net.Core;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Core.*;
import jio.System.Reflection.*;
import log4net.Repository.*;
import jio.System.*;public class CompactRepositorySelector implements IRepositorySelector {protected NObject javonetHandle; public CompactRepositorySelector (Class defaultRepositoryType){ try {  javonetHandle = Javonet.New("CompactRepositorySelector",Javonet.getType(getReturnObjectName(defaultRepositoryType).getTypeName()));javonetHandle.addEventListener("LoggerRepositoryCreatedEvent", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (LoggerRepositoryCreationEventHandler handler : _LoggerRepositoryCreatedEventListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], LoggerRepositoryCreationEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CompactRepositorySelector(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public ILoggerRepository GetRepository (Assembly assembly){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetRepository",assembly));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ILoggerRepository GetRepository (java.lang.String repositoryName){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetRepository",repositoryName));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ILoggerRepository CreateRepository (Assembly assembly,Class repositoryType){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("CreateRepository",assembly,Javonet.getType(getReturnObjectName(repositoryType).getTypeName())));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ILoggerRepository CreateRepository (java.lang.String repositoryName,Class repositoryType){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("CreateRepository",repositoryName,Javonet.getType(getReturnObjectName(repositoryType).getTypeName())));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Boolean ExistsRepository (java.lang.String repositoryName){ try { return javonetHandle.invoke("ExistsRepository",repositoryName);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public ILoggerRepository[] GetAllRepositories (){ try { return Helper.ConvertNObjectToDestinationType((NObject[])javonetHandle.invoke("GetAllRepositories"),ILoggerRepository[].class);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Event
	 */
            private java.util.ArrayList< LoggerRepositoryCreationEventHandler> _LoggerRepositoryCreatedEventListeners = new java.util.ArrayList<LoggerRepositoryCreationEventHandler>();

            public void addLoggerRepositoryCreatedEvent(LoggerRepositoryCreationEventHandler toAdd)
            {
                _LoggerRepositoryCreatedEventListeners.add(toAdd);
            }
            public void removeLoggerRepositoryCreatedEvent(LoggerRepositoryCreationEventHandler toRemove)
            {
                _LoggerRepositoryCreatedEventListeners.remove(toRemove);
            }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}