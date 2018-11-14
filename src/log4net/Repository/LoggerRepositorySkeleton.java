package log4net.Repository;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import log4net.Repository.*;
import log4net.Core.*;
import log4net.Appender.*;
import jio.System.*;
import log4net.ObjectRenderer.*;
import log4net.Plugin.*;
import log4net.Util.*;public abstract class LoggerRepositorySkeleton implements ILoggerRepository {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setName (java.lang.String value){ try { javonetHandle.set("Name",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getName (){ try { return  (java.lang.String) javonetHandle.get("Name");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setThreshold (Level value){ try { javonetHandle.set("Threshold",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Level getThreshold (){ try { return new Level((NObject)javonetHandle.get("Threshold"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public RendererMap getRendererMap (){ try { return new RendererMap((NObject)javonetHandle.get("RendererMap"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public PluginMap getPluginMap (){ try { return new PluginMap((NObject)javonetHandle.get("PluginMap"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public LevelMap getLevelMap (){ try { return new LevelMap((NObject)javonetHandle.get("LevelMap"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setConfigured (java.lang.Boolean value){ try { javonetHandle.set("Configured",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getConfigured (){ try { return javonetHandle.get("Configured");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public PropertiesDictionary getProperties (){ try { return new PropertiesDictionary((NObject)javonetHandle.get("Properties"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public LoggerRepositorySkeleton(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public ILogger Exists (java.lang.String name){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("Exists",name));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ILogger[] GetCurrentLoggers (){ try { return Helper.ConvertNObjectToDestinationType((NObject[])javonetHandle.invoke("GetCurrentLoggers"),ILogger[].class);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public ILogger GetLogger (java.lang.String name){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetLogger",name));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void Shutdown (){ try { javonetHandle.invoke("Shutdown");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void ResetConfiguration (){ try { javonetHandle.invoke("ResetConfiguration");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Log (LoggingEvent logEvent){ try { javonetHandle.invoke("Log",logEvent);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public IAppender[] GetAppenders (){ try { return Helper.ConvertNObjectToDestinationType((NObject[])javonetHandle.invoke("GetAppenders"),IAppender[].class);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void AddRenderer (Class typeToRender,IObjectRenderer rendererInstance){ try { javonetHandle.invoke("AddRenderer",Javonet.getType(getReturnObjectName(typeToRender).getTypeName()),rendererInstance);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void RaiseConfigurationChanged (EventArgs e){ try { javonetHandle.invoke("RaiseConfigurationChanged",e);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Event
	 */
            private java.util.ArrayList< LoggerRepositoryShutdownEventHandler> _ShutdownEventListeners = new java.util.ArrayList<LoggerRepositoryShutdownEventHandler>();

            public void addShutdownEvent(LoggerRepositoryShutdownEventHandler toAdd)
            {
                _ShutdownEventListeners.add(toAdd);
            }
            public void removeShutdownEvent(LoggerRepositoryShutdownEventHandler toRemove)
            {
                _ShutdownEventListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< LoggerRepositoryConfigurationResetEventHandler> _ConfigurationResetListeners = new java.util.ArrayList<LoggerRepositoryConfigurationResetEventHandler>();

            public void addConfigurationReset(LoggerRepositoryConfigurationResetEventHandler toAdd)
            {
                _ConfigurationResetListeners.add(toAdd);
            }
            public void removeConfigurationReset(LoggerRepositoryConfigurationResetEventHandler toRemove)
            {
                _ConfigurationResetListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< LoggerRepositoryConfigurationChangedEventHandler> _ConfigurationChangedListeners = new java.util.ArrayList<LoggerRepositoryConfigurationChangedEventHandler>();

            public void addConfigurationChanged(LoggerRepositoryConfigurationChangedEventHandler toAdd)
            {
                _ConfigurationChangedListeners.add(toAdd);
            }
            public void removeConfigurationChanged(LoggerRepositoryConfigurationChangedEventHandler toRemove)
            {
                _ConfigurationChangedListeners.remove(toRemove);
            }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}