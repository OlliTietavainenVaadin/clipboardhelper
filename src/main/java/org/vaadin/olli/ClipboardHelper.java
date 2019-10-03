package org.vaadin.olli;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * Clipboard Helper enables you to pass text content that will be copied to the clipboard when a wrapped Component is clicked.
 */
@Tag("clipboard-helper")
@JsModule("./clipboard-helper.js")
@HtmlImport("clipboard-helper.html")
public class ClipboardHelper extends PolymerTemplate<ClipboardHelper.ClipboardHelperModel> {

    @Id("wrapper")
    private Div componentWrapper;

    /**
     * Creates a new ClipboardHelper component.
     *
     * @param content
     *     content to pass to the clipboard when the component is clicked
     * @param component
     *     component to wrap with this functionality
     */
    public ClipboardHelper(String content, Component component) {
        setContent(content);
        wrap(component);
    }

    public ClipboardHelper() {

    }

    /**
     * Wrap a component so that clicking it will copy this helper's content to the clipboard.
     *
     * @param component
     *     any Component to wrap
     */
    public void wrap(Component component) {
        componentWrapper.removeAll();
        componentWrapper.add(component);
    }

    /**
     * Set the content that will be copied to the clipboard when the wrapped component is clicked
     *
     * @param content
     *     text content that will be copied to the clipboard
     */
    public void setContent(String content) {
        getModel().setContent(content);
    }

    /**
     * This model binds properties between ClipboardHelper and clipboard-helper.html
     */
    public interface ClipboardHelperModel extends TemplateModel {
        String getContent();

        void setContent(String content);
    }
}
