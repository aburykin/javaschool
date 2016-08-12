package Homework_7.task_1;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * Created by ABurykin on 12.08.2016.
 */

/*
Ваша задача написать загрузчик плагинов в вашу систему.
Допустим вы пишите свой браузер и хотите чтобы люди имели имели возможность писать плагины для него.
Соответственно, разные разработчики могут назвать свои классы одинаковым именем, ваш загрузчик должен корректно это обрабатывать.

Задача реализовать класс PluginManager.

Plugin - это базовый интерфейс  для всех плагинов

PluginManager ищет скомпилированные классы плагина в папке pluginRootDirectory\pluginName\

Усложненная версия задания. Система должна вести себя корректно если в плагине,
есть скомпилированные классы с именем, которые есть в вашем браузере(не в плагинах),
должны использоваться классы плагина, а не вашего браузера.
Для этого придется поменять модель делегирования класслоадера в методе loadClass

*/

// загрузчик плагинов
public class PluginManager {
    private final String pluginRootDirectory;

    public PluginManager(String pluginRootDirectory) {
        this.pluginRootDirectory = pluginRootDirectory;
    }

    public Plugin load(String pluginName, String pluginClassName) {
        try {
            URL url = new URL("file://"+pluginRootDirectory);

            URLClassLoader MyClassLoader = new URLClassLoader(new URL[]{url});
           // MyClassLoader.loadClass()


        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


        return null;
    }
}