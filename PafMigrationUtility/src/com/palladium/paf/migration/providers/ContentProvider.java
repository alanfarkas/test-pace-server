package com.palladium.paf.migration.providers;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import com.palladium.paf.migration.MigrationAction;

public class ContentProvider implements IStructuredContentProvider {
	public Object[] getElements(Object inputElement) {
		return (MigrationAction[]) inputElement;
	}

	public void dispose() {
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}
}