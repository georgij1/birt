/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/12.0.9
 * Generated at: 2024-07-31 11:00:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.webcontent.birt.pages.dialog;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.birt.report.presentation.aggregation.IFragment;
import org.eclipse.birt.report.IBirtConstants;
import java.util.ArrayList;
import java.util.Map;
import org.eclipse.birt.report.utility.Printer;
import org.eclipse.birt.report.utility.DataUtil;
import org.eclipse.birt.report.utility.PrintUtility;
import org.eclipse.birt.report.utility.ParameterAccessor;
import org.eclipse.birt.report.resource.BirtResources;

public final class PrintReportServerDialogFragment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.eclipse.birt.report.resource.BirtResources");
    _jspx_imports_classes.add("org.eclipse.birt.report.utility.Printer");
    _jspx_imports_classes.add("org.eclipse.birt.report.utility.DataUtil");
    _jspx_imports_classes.add("org.eclipse.birt.report.utility.PrintUtility");
    _jspx_imports_classes.add("org.eclipse.birt.report.utility.ParameterAccessor");
    _jspx_imports_classes.add("org.eclipse.birt.report.presentation.aggregation.IFragment");
    _jspx_imports_classes.add("java.util.Map");
    _jspx_imports_classes.add("org.eclipse.birt.report.IBirtConstants");
    _jspx_imports_classes.add("java.util.ArrayList");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 0, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
      org.eclipse.birt.report.presentation.aggregation.IFragment fragment = null;
      fragment = (org.eclipse.birt.report.presentation.aggregation.IFragment) _jspx_page_context.getAttribute("fragment", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (fragment == null){
        throw new java.lang.InstantiationException("bean fragment not found within scope");
      }
      out.write("\n");
      out.write("\n");
      out.write("<SCRIPT LANGUAGE=\"javascript\">var index = 0;</SCRIPT>\n");

	boolean enable = ParameterAccessor.isSupportedPrintOnServer;
	if( enable )
	{
		String[] supportedFormats = ParameterAccessor.supportedFormats;
		for( int i=0; i<supportedFormats.length; i++ )
		{
			if( IBirtConstants.POSTSCRIPT_RENDER_FORMAT.equalsIgnoreCase( supportedFormats[i] ) )
			{
				enable = true;
				break;
			}
		}
	}
	
	if( enable )
	{
		ArrayList printers = (ArrayList)PrintUtility.findPrinters();
		for( int i=0; i<printers.size( ); i++ )
		{
			Printer bean = (Printer)printers.get( i );
			String name = PrintUtility.handleSlash( bean.getName( ) );
			String status = null; 
				
			if ( bean.getStatus() == Printer.STATUS_ACCEPTING_JOBS )
			{
				status = BirtResources.getMessage( "birt.viewer.dialog.printserver.status.acceptingjobs" ); // TODO: localized key
			}
			else 
			{
				status = BirtResources.getMessage( "birt.viewer.dialog.printserver.status.notacceptingjobs" ); // TODO: localized key
			}
			status = DataUtil.trimString( status );
			
			String model = DataUtil.trimString( bean.getModel( ) );
			String info = DataUtil.trimString( bean.getInfo( ) );
			String copies = "" + bean.getCopies( );
			String mode = "" + bean.getMode( );
			String duplex = "" + bean.getDuplex( );
			String mediaSize = DataUtil.trimString( bean.getMediaSize( ) );
			Map map = bean.getMediaSizeNames( );
			Object[] mediaSizeNames = map.keySet( ).toArray( );

      out.write("\n");
      out.write("			<SCRIPT LANGUAGE=\"javascript\">\n");
      out.write("				var printer = new Printer( );\n");
      out.write("				printer.setName( \"");
      out.print( name );
      out.write("\" );\n");
      out.write("				printer.setStatus( \"");
      out.print( status );
      out.write("\" );\n");
      out.write("				printer.setModel( \"");
      out.print( model );
      out.write("\" );\n");
      out.write("				printer.setInfo( \"");
      out.print( info );
      out.write("\" );\n");
      out.write("				\n");
      out.write("				// Copies attribute\n");
      out.write("				");

				if( bean.isCopiesSupported() )
				{
				
      out.write("\n");
      out.write("				printer.setCopiesSupported( true );\n");
      out.write("				printer.setCopies( \"");
      out.print( copies );
      out.write("\" );\n");
      out.write("				");

				}
				else
				{
				
      out.write("	\n");
      out.write("				printer.setCopiesSupported( false );\n");
      out.write("				");

				}
				
      out.write("\n");
      out.write("				\n");
      out.write("				// Collate attribute\n");
      out.write("				");

				if( bean.isCollateSupported() )
				{
				
      out.write("\n");
      out.write("				printer.setCollateSupported( true );\n");
      out.write("					");

					if( bean.isCollate( ) )
					{
					
      out.write("\n");
      out.write("				printer.setCollate( true );\n");
      out.write("					");

					}
					else
					{
					
      out.write("\n");
      out.write("				printer.setCollate( false );	\n");
      out.write("				");

					}
				}
				else
				{
				
      out.write("	\n");
      out.write("				printer.setCopiesSupported( false );\n");
      out.write("				");

				}
				
      out.write("\n");
      out.write("				\n");
      out.write("				// Mode attribute\n");
      out.write("				");

				if( bean.isModeSupported( ) )
				{
				
      out.write("\n");
      out.write("				printer.setModeSupported( true );\n");
      out.write("				printer.setMode( \"");
      out.print( mode );
      out.write("\" );\n");
      out.write("				");

				}
				else
				{
				
      out.write("	\n");
      out.write("				printer.setModeSupported( false );\n");
      out.write("				");

				}
				
      out.write("				\n");
      out.write("\n");
      out.write("				// Duplex attribute\n");
      out.write("				");

				if( bean.isDuplexSupported( ) )
				{
				
      out.write("\n");
      out.write("				printer.setDuplexSupported( true );\n");
      out.write("				printer.setDuplex( \"");
      out.print( duplex );
      out.write("\" );\n");
      out.write("				");

				}
				else
				{
				
      out.write("	\n");
      out.write("				printer.setDuplexSupported( false );\n");
      out.write("				");

				}
				
      out.write("	\n");
      out.write("				\n");
      out.write("				// Media attribute\n");
      out.write("				");

				if( bean.isMediaSupported( ) )
				{
				
      out.write("\n");
      out.write("				printer.setMediaSupported( true );\n");
      out.write("				printer.setMediaSize( \"");
      out.print( mediaSize );
      out.write("\" );\n");
      out.write("					");

					for( int j=0; j<mediaSizeNames.length; j++ )
					{
						String mediaSizeName = DataUtil.trimString( (String)mediaSizeNames[j] );
						mediaSizeName = ParameterAccessor.htmlEncode( mediaSizeName );
					
      out.write("\n");
      out.write("				printer.addMediaSizeName( \"");
      out.print( mediaSizeName );
      out.write("\" );						\n");
      out.write("				");

					}
				}
				else
				{
				
      out.write("	\n");
      out.write("				printer.setMediaSupported( false );\n");
      out.write("				");

				}
				
      out.write("	\n");
      out.write("				\n");
      out.write("				if( !printers[index] )								\n");
      out.write("					printers[index] = {};\n");
      out.write("					\n");
      out.write("				printers[index].name = printer.getName( );\n");
      out.write("				printers[index].value = printer;\n");
      out.write("				\n");
      out.write("				index++;\n");
      out.write("				\n");
      out.write("			</SCRIPT>\n");
		
		}
	}	

      out.write('\n');
      out.write("\n");
      out.write("<TABLE CELLSPACING=\"2\" CELLPADDING=\"2\" CLASS=\"birtviewer_dialog_body\">\n");
      out.write("	<TR HEIGHT=\"5px\"><TD></TD></TR>\n");
      out.write("	<TR>\n");
      out.write("		<TD>\n");
      out.write("			<INPUT TYPE=\"checkbox\" ID=\"print_onserver\" ");
if( !enable ) { 
      out.write("DISABLED=\"true\"");
}
      out.write("/>\n");
      out.write("			");
      out.print(BirtResources.getMessage( "birt.viewer.dialog.printserver.onserver" ));
      out.write("\n");
      out.write("		</TD>\n");
      out.write("	</TR>\n");
      out.write("	<TR HEIGHT=\"5px\"><TD></TD></TR>\n");
      out.write("	<TR>\n");
      out.write("		<TD>\n");
      out.write("			<TABLE WIDTH=\"100%\" ID=\"printer_general\">\n");
      out.write("				<TR>\n");
      out.write("					<TD WIDTH=\"80px\">");
      out.print(BirtResources.getMessage( "birt.viewer.dialog.printserver.printer" ));
      out.write("</TD>\n");
      out.write("					<TD>						\n");
      out.write("						<SELECT ID=\"printer\" CLASS=\"birtviewer_printreportserver_dialog_select\"></SELECT>\n");
      out.write("					</TD>\n");
      out.write("				</TR>\n");
      out.write("				<TR>\n");
      out.write("					<TD>");
      out.print(BirtResources.getMessage( "birt.viewer.dialog.printserver.status" ));
      out.write("</TD>\n");
      out.write("					<TD><LABEL ID=\"printer_status\"></LABEL></TD>\n");
      out.write("				</TR>\n");
      out.write("				<TR>\n");
      out.write("					<TD>");
      out.print(BirtResources.getMessage( "birt.viewer.dialog.printserver.model" ));
      out.write("</TD>\n");
      out.write("					<TD><LABEL ID=\"printer_model\"></LABEL></TD>\n");
      out.write("				</TR>\n");
      out.write("				<TR>\n");
      out.write("					<TD>");
      out.print(BirtResources.getMessage( "birt.viewer.dialog.printserver.description" ));
      out.write("</TD>\n");
      out.write("					<TD><LABEL ID=\"printer_description\"></LABEL></TD>\n");
      out.write("				</TR>\n");
      out.write("			</TABLE>\n");
      out.write("		</TD>\n");
      out.write("	</TR>			\n");
      out.write("	<TR HEIGHT=\"5px\"><TD><HR/></TD></TR>\n");
      out.write("	<TR>\n");
      out.write("		<TD>");
      out.print(BirtResources.getMessage( "birt.viewer.dialog.printserver.settings" ));
      out.write("</TD>\n");
      out.write("	</TR>	\n");
      out.write("	<TR>\n");
      out.write("		<TD>\n");
      out.write("			<TABLE WIDTH=\"100%\" ID=\"printer_config\">\n");
      out.write("				<TR>\n");
      out.write("					<TD WIDTH=\"100px\">\n");
      out.write("						");
      out.print(BirtResources.getMessage( "birt.viewer.dialog.printserver.settings.copies" ));
      out.write("\n");
      out.write("					</TD>\n");
      out.write("					<TD>\n");
      out.write("						<INPUT TYPE=\"text\" CLASS=\"birtviewer_printreportserver_dialog_input_short\" ID=\"printer_copies\"/>\n");
      out.write("						&nbsp;&nbsp;");
      out.print(BirtResources.getMessage( "birt.viewer.dialog.printserver.settings.collate" ));
      out.write("&nbsp;&nbsp;<INPUT TYPE=\"checkbox\" ID=\"printer_collate\"/>						\n");
      out.write("					</TD>\n");
      out.write("				</TR>	\n");
      out.write("				<TR>\n");
      out.write("					<TD>\n");
      out.write("						");
      out.print(BirtResources.getMessage( "birt.viewer.dialog.printserver.settings.duplex" ));
      out.write("\n");
      out.write("					</TD>\n");
      out.write("					<TD>						\n");
      out.write("						<INPUT TYPE=\"radio\" ID=\"printer_duplexSimplex\" NAME=\"printerDuplex\"/>");
      out.print(BirtResources.getMessage( "birt.viewer.dialog.printserver.settings.duplex.simplex" ));
      out.write("\n");
      out.write("						&nbsp;&nbsp;<INPUT TYPE=\"radio\" ID=\"printer_duplexHorz\" NAME=\"printerDuplex\"/>");
      out.print(BirtResources.getMessage( "birt.viewer.dialog.printserver.settings.duplex.horizontal" ));
      out.write("\n");
      out.write("						&nbsp;&nbsp;<INPUT TYPE=\"radio\" ID=\"printer_duplexVert\" NAME=\"printerDuplex\"/>");
      out.print(BirtResources.getMessage( "birt.viewer.dialog.printserver.settings.duplex.vertical" ));
      out.write("			\n");
      out.write("					</TD>\n");
      out.write("				</TR>\n");
      out.write("				<TR>\n");
      out.write("					<TD>\n");
      out.write("						");
      out.print(BirtResources.getMessage( "birt.viewer.dialog.printserver.settings.mode" ));
      out.write("\n");
      out.write("					</TD>\n");
      out.write("					<TD>						\n");
      out.write("						<INPUT TYPE=\"radio\" ID=\"printer_modeBW\" NAME=\"printerMode\"/>");
      out.print(BirtResources.getMessage( "birt.viewer.dialog.printserver.settings.mode.bw" ));
      out.write("\n");
      out.write("						&nbsp;&nbsp;<INPUT TYPE=\"radio\" ID=\"printer_modeColor\" NAME=\"printerMode\"/>");
      out.print(BirtResources.getMessage( "birt.viewer.dialog.printserver.settings.mode.color" ));
      out.write("			\n");
      out.write("					</TD>\n");
      out.write("				</TR>\n");
      out.write("				<TR>\n");
      out.write("					<TD>\n");
      out.write("						");
      out.print(BirtResources.getMessage( "birt.viewer.dialog.printserver.settings.pagesize" ));
      out.write("\n");
      out.write("					</TD>				\n");
      out.write("					<TD>						\n");
      out.write("						<SELECT ID=\"printer_mediasize\" CLASS=\"birtviewer_printreportserver_dialog_select\"></SELECT>\n");
      out.write("					</TD>\n");
      out.write("				</TR>					\n");
      out.write("			</TABLE>\n");
      out.write("		</TD>\n");
      out.write("	</TR>	\n");
      out.write("	<TR HEIGHT=\"5px\"><TD><HR/></TD></TR>\n");
      out.write("	<TR>\n");
      out.write("		<TD> \n");
      out.write("			<DIV ID=\"printServerPageSetting\">\n");
      out.write("				<TABLE>\n");
      out.write("					<TR>\n");
      out.write("						<TD>");
      out.print(BirtResources.getMessage( "birt.viewer.dialog.printserver.settings.print" ));
      out.write("</TD>\n");
      out.write("						<TD STYLE=\"padding-left:5px\">\n");
      out.write("							<INPUT TYPE=\"radio\" ID=\"printServerPageAll\" NAME=\"printServerPages\" CHECKED/>");
      out.print(BirtResources.getMessage( "birt.viewer.dialog.page.all" ));
      out.write("\n");
      out.write("						</TD>\n");
      out.write("						<TD STYLE=\"padding-left:5px\">	\n");
      out.write("							<INPUT TYPE=\"radio\" ID=\"printServerPageCurrent\" NAME=\"printServerPages\"/>");
      out.print(BirtResources.getMessage( "birt.viewer.dialog.page.current" ));
      out.write("\n");
      out.write("						</TD>\n");
      out.write("						<TD STYLE=\"padding-left:5px\">	\n");
      out.write("							<INPUT TYPE=\"radio\" ID=\"printServerPageRange\" NAME=\"printServerPages\"/>");
      out.print(BirtResources.getMessage( "birt.viewer.dialog.page.range" ));
      out.write("\n");
      out.write("							<INPUT TYPE=\"text\" CLASS=\"birtviewer_printreportserver_dialog_input\" ID=\"printServerPageRange_input\"/>\n");
      out.write("						</TD>\n");
      out.write("					</TR>\n");
      out.write("				</TABLE>			\n");
      out.write("			</DIV>						\n");
      out.write("		</TD>\n");
      out.write("	</TR>	\n");
      out.write("	<TR>\n");
      out.write("		<TD>&nbsp;&nbsp;");
      out.print(BirtResources.getMessage( "birt.viewer.dialog.page.range.description" ));
      out.write("</TD>\n");
      out.write("	</TR>	\n");
      out.write("	<TR HEIGHT=\"5px\"><TD><HR/></TD></TR>\n");
      out.write("	<TR>\n");
      out.write("		<TD>\n");
      out.write("			<DIV ID=\"printServerFitSetting\">\n");
      out.write("				<TABLE>\n");
      out.write("					<TR>\n");
      out.write("						<TD>\n");
      out.write("							<INPUT TYPE=\"radio\" ID=\"printServerFitToAuto\" NAME=\"printServerFit\" CHECKED/>");
      out.print(BirtResources.getHtmlMessage( "birt.viewer.dialog.export.pdf.fittoauto" ));
      out.write("\n");
      out.write("						</TD>\n");
      out.write("						<TD>\n");
      out.write("							<INPUT TYPE=\"radio\" ID=\"printServerFitToActual\" NAME=\"printServerFit\"/>");
      out.print(BirtResources.getMessage( "birt.viewer.dialog.export.pdf.fittoactual" ));
      out.write("\n");
      out.write("						</TD>\n");
      out.write("						<TD STYLE=\"padding-left:5px\">							\n");
      out.write("							<INPUT TYPE=\"radio\" ID=\"printServerFitToWhole\" NAME=\"printServerFit\"/>");
      out.print(BirtResources.getMessage( "birt.viewer.dialog.export.pdf.fittowhole" ));
      out.write("\n");
      out.write("						</TD>\n");
      out.write("					<TR>\n");
      out.write("				</TABLE>			\n");
      out.write("			</DIV>			\n");
      out.write("		</TD>\n");
      out.write("	</TR>\n");
      out.write("	<TR HEIGHT=\"5px\"><TD></TD></TR>	\n");
      out.write("</TABLE>\n");
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