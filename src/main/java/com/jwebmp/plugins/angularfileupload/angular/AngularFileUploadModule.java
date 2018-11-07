/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.angularfileupload.angular;

import com.jwebmp.core.base.angular.modules.AngularModuleBase;
import com.jwebmp.core.base.angular.services.IAngularModule;

/**
 * The Angular Auto Focus Directive that is applied
 *
 * @author Marc Magon
 * @since 30 May 2017
 */
public class AngularFileUploadModule
		extends AngularModuleBase
		implements IAngularModule<AngularFileUploadModule>
{
	/**
	 * An actual function
	 */
	/*
	 * Constructs a new Angular File Upload Binding Directive
	 */
	public AngularFileUploadModule()
	{
		super("ng-file-model");
	}

	/**
	 * Hash code identifier
	 *
	 * @return The integer
	 */
	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	/**
	 * Equals based on sort order and name
	 *
	 * @param obj
	 * 		object
	 *
	 * @return The assigned object
	 *
	 * @see com.jwebmp.core.base.angular.AngularReferenceBase#equals(Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		return super.equals(obj);
	}

	/**
	 * Overwrite the render function
	 *
	 * @return Null
	 *
	 * @see com.jwebmp.core.base.angular.AngularReferenceBase#renderFunction()
	 */
	@Override
	public String renderFunction()
	{
		return null;
	}

	/**
	 * If this page configurator is enabled
	 *
	 * @return if the configuration must run
	 */
	@Override
	public boolean enabled()
	{
		return AngularFileUploadPageConfigurator.isEnabled();
	}
}
