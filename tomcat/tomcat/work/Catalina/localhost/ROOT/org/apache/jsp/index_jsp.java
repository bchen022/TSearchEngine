/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.29
 * Generated at: 2015-11-30 00:21:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy");
request.setAttribute("year", sdf.format(new java.util.Date()));
request.setAttribute("tomcatUrl", "http://tomcat.apache.org/");
request.setAttribute("tomcatDocUrl", "/docs/");
request.setAttribute("tomcatExamplesUrl", "/examples/");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\" />\r\n");
      out.write("        <title>");
      out.print(request.getServletContext().getServerInfo() );
      out.write("</title>\r\n");
      out.write("        <link href=\"favicon.ico\" rel=\"icon\" type=\"image/x-icon\" />\r\n");
      out.write("        <link href=\"favicon.ico\" rel=\"shortcut icon\" type=\"image/x-icon\" />\r\n");
      out.write("        <link href=\"tomcat.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"wrapper\">\r\n");
      out.write("            <div id=\"navigation\" class=\"curved container\">\r\n");
      out.write("                <span id=\"nav-home\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">Home</a></span>\r\n");
      out.write("                <span id=\"nav-hosts\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">Documentation</a></span>\r\n");
      out.write("                <span id=\"nav-config\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("config/\">Configuration</a></span>\r\n");
      out.write("                <span id=\"nav-examples\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatExamplesUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">Examples</a></span>\r\n");
      out.write("                <span id=\"nav-wiki\"><a href=\"http://wiki.apache.org/tomcat/FrontPage\">Wiki</a></span>\r\n");
      out.write("                <span id=\"nav-lists\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("lists.html\">Mailing Lists</a></span>\r\n");
      out.write("                <span id=\"nav-help\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("findhelp.html\">Find Help</a></span>\r\n");
      out.write("                <br class=\"separator\" />\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"asf-box\">\r\n");
      out.write("                <h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.serverInfo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h1>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"upper\" class=\"curved container\">\r\n");
      out.write("                <div id=\"congrats\" class=\"curved container\">\r\n");
      out.write("                    <h2>If you're seeing this, you've successfully installed Tomcat. Congratulations!</h2>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"notice\">\r\n");
      out.write("                    <img src=\"tomcat.png\" alt=\"[tomcat logo]\" />\r\n");
      out.write("                    <div id=\"tasks\">\r\n");
      out.write("                        <h3>Recommended Reading:</h3>\r\n");
      out.write("                        <h4><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("security-howto.html\">Security Considerations HOW-TO</a></h4>\r\n");
      out.write("                        <h4><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("manager-howto.html\">Manager Application HOW-TO</a></h4>\r\n");
      out.write("                        <h4><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("cluster-howto.html\">Clustering/Session Replication HOW-TO</a></h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"actions\">\r\n");
      out.write("                    <div class=\"button\">\r\n");
      out.write("                        <a class=\"container shadow\" href=\"/manager/status\"><span>Server Status</span></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"button\">\r\n");
      out.write("                        <a class=\"container shadow\" href=\"/manager/html\"><span>Manager App</span></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"button\">\r\n");
      out.write("                        <a class=\"container shadow\" href=\"/host-manager/html\"><span>Host Manager</span></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!--\r\n");
      out.write("                <br class=\"separator\" />\r\n");
      out.write("                -->\r\n");
      out.write("                <br class=\"separator\" />\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"middle\" class=\"curved container\">\r\n");
      out.write("                <h3>Developer Quick Start</h3>\r\n");
      out.write("                <div class=\"col25\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <p><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("setup.html\">Tomcat Setup</a></p>\r\n");
      out.write("                        <p><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("appdev/\">First Web Application</a></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col25\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <p><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("realm-howto.html\">Realms &amp; AAA</a></p>\r\n");
      out.write("                        <p><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("jndi-datasource-examples-howto.html\">JDBC DataSources</a></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col25\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <p><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatExamplesUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">Examples</a></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col25\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <p><a href=\"http://wiki.apache.org/tomcat/Specifications\">Servlet Specifications</a></p>\r\n");
      out.write("                        <p><a href=\"http://wiki.apache.org/tomcat/TomcatVersions\">Tomcat Versions</a></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br class=\"separator\" />\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"lower\">\r\n");
      out.write("                <div id=\"low-manage\" class=\"\">\r\n");
      out.write("                    <div class=\"curved container\">\r\n");
      out.write("                        <h3>Managing Tomcat</h3>\r\n");
      out.write("                        <p>For security, access to the <a href=\"/manager/html\">manager webapp</a> is restricted.\r\n");
      out.write("                        Users are defined in:</p>\r\n");
      out.write("                        <pre>$CATALINA_HOME/conf/tomcat-users.xml</pre>\r\n");
      out.write("                        <p>In Tomcat 8.0 access to the manager application is split between\r\n");
      out.write("                           different users. &nbsp; <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("manager-howto.html\">Read more...</a></p>\r\n");
      out.write("                        <br />\r\n");
      out.write("                        <h4><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("RELEASE-NOTES.txt\">Release Notes</a></h4>\r\n");
      out.write("                        <h4><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("changelog.html\">Changelog</a></h4>\r\n");
      out.write("                        <h4><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("migration.html\">Migration Guide</a></h4>\r\n");
      out.write("                        <h4><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("security.html\">Security Notices</a></h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"low-docs\" class=\"\">\r\n");
      out.write("                    <div class=\"curved container\">\r\n");
      out.write("                        <h3>Documentation</h3>\r\n");
      out.write("                        <h4><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">Tomcat 8.0 Documentation</a></h4>\r\n");
      out.write("                        <h4><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("config/\">Tomcat 8.0 Configuration</a></h4>\r\n");
      out.write("                        <h4><a href=\"http://wiki.apache.org/tomcat/FrontPage\">Tomcat Wiki</a></h4>\r\n");
      out.write("                        <p>Find additional important configuration information in:</p>\r\n");
      out.write("                        <pre>$CATALINA_HOME/RUNNING.txt</pre>\r\n");
      out.write("                        <p>Developers may be interested in:</p>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"http://tomcat.apache.org/bugreport.html\">Tomcat 8.0 Bug Database</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("api/index.html\">Tomcat 8.0 JavaDocs</a></li>\r\n");
      out.write("                            <li><a href=\"http://svn.apache.org/repos/asf/tomcat/tc8.0.x/\">Tomcat 8.0 SVN Repository</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"low-help\" class=\"\">\r\n");
      out.write("                    <div class=\"curved container\">\r\n");
      out.write("                        <h3>Getting Help</h3>\r\n");
      out.write("                        <h4><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("faq/\">FAQ</a> and <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("lists.html\">Mailing Lists</a></h4>\r\n");
      out.write("                        <p>The following mailing lists are available:</p>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li id=\"list-announce\"><strong><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("lists.html#tomcat-announce\">tomcat-announce</a><br />\r\n");
      out.write("                                Important announcements, releases, security vulnerability notifications. (Low volume).</strong>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("lists.html#tomcat-users\">tomcat-users</a><br />\r\n");
      out.write("                                User support and discussion\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("lists.html#taglibs-user\">taglibs-user</a><br />\r\n");
      out.write("                                User support and discussion for <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("taglibs/\">Apache Taglibs</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("lists.html#tomcat-dev\">tomcat-dev</a><br />\r\n");
      out.write("                                Development mailing list, including commit messages\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br class=\"separator\" />\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"footer\" class=\"curved container\">\r\n");
      out.write("                <div class=\"col20\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <h4>Other Downloads</h4>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("download-connectors.cgi\">Tomcat Connectors</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("download-native.cgi\">Tomcat Native</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("taglibs/\">Taglibs</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("deployer-howto.html\">Deployer</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col20\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <h4>Other Documentation</h4>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("connectors-doc/\">Tomcat Connectors</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("connectors-doc/\">mod_jk Documentation</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("native-doc/\">Tomcat Native</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("deployer-howto.html\">Deployer</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col20\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <h4>Get Involved</h4>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("getinvolved.html\">Overview</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("svn.html\">SVN Repositories</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("lists.html\">Mailing Lists</a></li>\r\n");
      out.write("                            <li><a href=\"http://wiki.apache.org/tomcat/FrontPage\">Wiki</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col20\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <h4>Miscellaneous</h4>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("contact.html\">Contact</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("legal.html\">Legal</a></li>\r\n");
      out.write("                            <li><a href=\"http://www.apache.org/foundation/sponsorship.html\">Sponsorship</a></li>\r\n");
      out.write("                            <li><a href=\"http://www.apache.org/foundation/thanks.html\">Thanks</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col20\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <h4>Apache Software Foundation</h4>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("whoweare.html\">Who We Are</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("heritage.html\">Heritage</a></li>\r\n");
      out.write("                            <li><a href=\"http://www.apache.org\">Apache Home</a></li>\r\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("resources.html\">Resources</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br class=\"separator\" />\r\n");
      out.write("            </div>\r\n");
      out.write("            <p class=\"copyright\">Copyright &copy;1999-");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${year}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" Apache Software Foundation.  All Rights Reserved</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
