package org.gjt.sp.jedit.options;

import org.gjt.sp.jedit.AbstractOptionPane;
import org.gjt.sp.jedit.jEdit;

public class ScrollbarOptionPane extends AbstractOptionPane {

	private static final String SCROLLBAR_ENABLED_PROPERTY =
			"view.scrollbar.enabled";
	
	public ScrollbarOptionPane(String internalName) {
		super(internalName);
		// TODO Auto-generated constructor stub
	}

	public static boolean isScrollbarEnabled()
	{
		return jEdit.getBooleanProperty(SCROLLBAR_ENABLED_PROPERTY);
	} 
}
