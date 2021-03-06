package org.jboss.shrinkwrap.android.api.spec.node;

import org.jboss.shrinkwrap.android.api.spec.XmlNode;

/**
 * @author <a href="mailto:tkriz@redhat.com">Tadeas Kriz</a>
 */
public class UsesLibrary implements XmlNode {

    private String name = null;
    private Boolean required = null;

    public String getName() {
        return name;
    }

    public UsesLibrary setName(String name) {
        this.name = name;
        return this;
    }

    public Boolean getRequired() {
        return required;
    }

    public UsesLibrary setRequired(Boolean required) {
        this.required = required;
        return this;
    }

    @Override
    public void validate() {
        if(name == null) {
            throw new IllegalStateException("Attribute \"name\" mustn't be null!");
        }
    }

    @Override
    public String toXmlString(String indent) {
        StringBuilder builder = new StringBuilder();

        builder.append(indent).append("<uses-library \n");

        if(name != null) {
            builder.append(indent).append("\tandroid:name=\"").append(name).append("\" \n");
        }
        if(required != null) {
            builder.append(indent).append("\tandroid:required=\"").append(required).append("\" \n");
        }

        builder.append(indent).append("/>\n");

        return builder.toString();
    }
}
