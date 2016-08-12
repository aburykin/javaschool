package Homework_7.task_1;

import Homework_7.task_1.pluginRootDirectory.pluginName.AnotherPlugin1;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * Created by ABurykin on 12.08.2016.
 */
public class Main {
    public static void main(String[]  args) throws MalformedURLException, ClassNotFoundException, IllegalAccessException, InstantiationException {

        URL url = new URL("file://C:/Users/ABurykin/Desktop/GIT Projects/src/Homework_7/task_1/pluginRootDirectory/pluginName/");
        URLClassLoader initiating = new URLClassLoader(new URL[]{url},null);
        Class<?> clazz =  initiating.loadClass("Homework_7.task_1.pluginRootDirectory.pluginName.AnotherPlugin1");

        System.out.print("AnotherPlugin1.getClassLoader() = " + clazz.getClassLoader());
        AnotherPlugin1 x =  (AnotherPlugin1)clazz.newInstance();
        x.doUsefull();
    }
}










//   PluginManager pluginMamager = new PluginManager("/pluginRootDirectory/pluginName");

// AnotherPlugin1 ap1_0 = new AnotherPlugin1();



       /* ClassLoader loader = Main.class.getClassLoader();
        Class<?> clazz = loader.loadClass("Homework_7.task_1.pluginRootDirectory.pluginName.AnotherPlugin1");

        System.out.print(ap1_0.getClass() == clazz);
        */

// Теперь попробую загрузить другим класслоадером
       /* URL url = new URL("file://C:/Users/ABurykin/Desktop/GIT Projects/src/Homework_7/task_1/pluginRootDirectory/pluginName/");
        URLClassLoader initiating = new URLClassLoader(new URL[]{url},null);
        Class<?> clazz =  initiating.loadClass("Homework_7.task_1.pluginRootDirectory.pluginName.AnotherPlugin1");

       // Class<?> clazz =  initiating.loadClass("AnotherPlugin1");
        System.out.print("AnotherPlugin1.getClassLoader() = " + clazz.getClassLoader());

        System.out.print(ap1_0.getClass() == clazz);
*/
        /*
        URL url = new URL("file/pluginRootDirectory/pluginName");
        URLClassLoader loader = new URLClassLoader(new URL[]{url});
        Class clazz =  loader.loadClass("AnotherPlugin1");
        AnotherPlugin1 p1 = (AnotherPlugin1)clazz.newInstance();
        p1.doUsefull();
*/