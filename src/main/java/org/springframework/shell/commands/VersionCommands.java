package org.springframework.shell.commands;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.shell.core.CommandMarker;
import org.springframework.stereotype.Component;

/**
 * Essential built-in shell commands.
 * 
 * @author Mark Pollack
 * @author Erwin Vervaet
 */
@Component
public class VersionCommands implements CommandMarker, ApplicationContextAware {

	private ApplicationContext ctx;

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.setCtx(applicationContext);
	}

	public ApplicationContext getCtx() {
		return ctx;
	}

	public void setCtx(ApplicationContext ctx) {
		this.ctx = ctx;
	}
}
