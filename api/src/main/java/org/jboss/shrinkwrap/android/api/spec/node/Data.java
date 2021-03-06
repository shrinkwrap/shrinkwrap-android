package org.jboss.shrinkwrap.android.api.spec.node;

import org.jboss.shrinkwrap.android.api.spec.XmlNode;

/**
 * @author <a href="mailto:tkriz@redhat.com">Tadeas Kriz</a>
 */
public class Data implements XmlNode {

    private String host = null;
    private String mimeType = null;
    private String path = null;
    private String pathPattern = null;
    private String pathPrefix = null;
    private String port = null;
    private String scheme = null;

    public String getHost() {
        return host;
    }

    public Data setHost(String host) {
        this.host = host;
        return this;
    }

    public String getMimeType() {
        return mimeType;
    }

    public Data setMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    public String getPath() {
        return path;
    }

    public Data setPath(String path) {
        this.path = path;
        return this;
    }

    public String getPathPattern() {
        return pathPattern;
    }

    public Data setPathPattern(String pathPattern) {
        this.pathPattern = pathPattern;
        return this;
    }

    public String getPathPrefix() {
        return pathPrefix;
    }

    public Data setPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
        return this;
    }

    public String getPort() {
        return port;
    }

    public Data setPort(String port) {
        this.port = port;
        return this;
    }

    public String getScheme() {
        return scheme;
    }

    public Data setScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }

    @Override
    public void validate() {
        // TODO add validation
    }

    @Override
    public String toXmlString(String indent) {
        StringBuilder builder = new StringBuilder();

        builder.append(indent).append("<data \n");
        if(host != null) {
            builder.append(indent).append("\tandroid:host=\"").append(host).append("\" \n");
        }
        if(mimeType != null) {
            builder.append(indent).append("\tandroid:mimeType=\"").append(mimeType).append("\" \n");
        }
        if(path != null) {
            builder.append(indent).append("\tandroid:path=\"").append(path).append("\" \n");
        }
        if(pathPattern != null) {
            builder.append(indent).append("\tandroid:pathPattern=\"").append(pathPattern).append("\" \n");
        }
        if(pathPrefix != null) {
            builder.append(indent).append("\tandroid:pathPrefix=\"").append(pathPrefix).append("\" \n");
        }
        if(port != null) {
            builder.append(indent).append("\tandroid:port=\"").append(port).append("\" \n");
        }
        if(scheme != null) {
            builder.append(indent).append("\tandroid:scheme=\"").append(scheme).append("\" \n");
        }
        builder.append(indent).append("/>\n");

        return builder.toString();
    }
}
