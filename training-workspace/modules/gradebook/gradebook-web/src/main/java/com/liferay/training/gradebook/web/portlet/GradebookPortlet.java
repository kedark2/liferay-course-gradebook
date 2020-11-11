package com.liferay.training.gradebook.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.training.gradebook.web.constants.GradebookPortletKeys;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;


/**
 * @author Kedar
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Gradebook",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + GradebookPortletKeys.Gradebook,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"com.liferay.portlet.display-category=category.training",
		"com.liferay.portlet.instanceable=false",
	},
	service = Portlet.class
)
public class GradebookPortlet extends MVCPortlet {
}