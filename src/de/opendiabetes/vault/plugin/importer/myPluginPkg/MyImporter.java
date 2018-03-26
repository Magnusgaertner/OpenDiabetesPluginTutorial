/*
 * Copyright (C) 2017 OpenDiabetes
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.opendiabetes.vault.plugin.importer.myPluginPkg;

import de.opendiabetes.vault.container.VaultEntry;
import de.opendiabetes.vault.plugin.importer.fileimporter.AbstractFileImporter;
import org.pf4j.Extension;
import org.pf4j.Plugin;
import org.pf4j.PluginWrapper;

import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;

/**
 * Wrapper class for the MyImporter plugin.
 * This is an example on how to build plugins for OpenDiabetes.
 * The wrapper class MyImporter is needed for the plugin framework PF4J to load this plugin.
 * It is necessary that there is a class extending org.pf4j.Plugin that has an inner class marked as @Extension
 * Make sure that this inner class is named in the convention plugin.id+Importer, you can specify your plugin id in plugin.properties.
 * Moreover make sure your inner class implements the OpenDiabetesPlugin interface, also it should implement one of the following Interfaces:
 * Importer, Exporter, Interpreter
 * appropriately.
 * If your plugin uses plugin specific libs that are not included in the OpenDiabetes base,
 * put them in the libs folder to include them in your compiled plugin.
 * You should also provide a default configuration named <plugin.id>.properties and provide a helpfile help.md
 * In this example we extend from the more specific AbstractFileImporter that already implements the OpenDiabetesPlugin interface.
 * once you are finished writing/wrapping your new code as plugin for OpenDiabetes run the ant target "package".
 * Afterwards you will find your compiled plugin in the MyPlugin folder.
 * Put the zip file into the plugin folder of the OpenDiabetes Program (currently /export) to use the plugin.
 *
 * @author Magnus Gärtner
 */
public class MyImporter extends Plugin {

    /**
     * Constructor for the PluginManager.
     *
     * @param wrapper The PluginWrapper.
     */
    public MyImporter(final PluginWrapper wrapper) {
        super(wrapper);
    }

    /**
     * Actual implementation of the  FileImporter plugin.
     */
    @Extension
    public static class MyImporterImplementation extends AbstractFileImporter {


        @Override
        protected List<VaultEntry> processImport(final InputStream inputStream, final String s) throws Exception {
            String message = "this is my own importer, "
                    + "currently it cannot process any import data!";
            this.notifyStatus(0, message);
            LOG.log(Level.INFO, message);
            System.out.println(message);
            return null;
        }

        @Override
        protected boolean loadPluginSpecificConfiguration(final Properties properties) {
            return true;
        }
    }

}
