<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" 
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
	xmlns:fo="http://www.w3.org/1999/XSL/Format"
	xmlns:fox="http://xmlgraphics.apache.org/fop/extensions"
	xmlns:dss="http://dss.esig.europa.eu/validation/detailed-report">
	<xsl:output method="xml" indent="yes" />

	<xsl:template match="/dss:DetailedReport">
		<fo:root>
			<xsl:attribute name="font-family">sans-serif</xsl:attribute>
			
			<fo:layout-master-set>
				<fo:simple-page-master>
					<xsl:attribute name="master-name">A4-portrait</xsl:attribute>
					<xsl:attribute name="page-height">29.7cm</xsl:attribute>
					<xsl:attribute name="page-width">21cm</xsl:attribute>
					<xsl:attribute name="margin-top">1cm</xsl:attribute>
					<xsl:attribute name="margin-bottom">1cm</xsl:attribute>
					<xsl:attribute name="margin-right">2.5cm</xsl:attribute>
					<xsl:attribute name="margin-left">2.5cm</xsl:attribute>
			
					<fo:region-body>
						<xsl:attribute name="margin-top">1cm</xsl:attribute>
						<xsl:attribute name="margin-bottom">1cm</xsl:attribute>
					</fo:region-body>

					<fo:region-after>
						<xsl:attribute name="region-name">page-footer</xsl:attribute>
						<xsl:attribute name="extent">0.5cm</xsl:attribute>
					</fo:region-after>
			
				</fo:simple-page-master>
			</fo:layout-master-set>

			<fo:page-sequence>
				<xsl:attribute name="master-reference">A4-portrait</xsl:attribute>
	
				<fo:static-content>
					<xsl:attribute name="flow-name">page-footer</xsl:attribute>
					<xsl:attribute name="font-size">5pt</xsl:attribute>
					
					<fo:block>
						<xsl:attribute name="color">grey</xsl:attribute>
						<xsl:attribute name="border-top-style">solid</xsl:attribute>
						<xsl:attribute name="border-top-color">grey</xsl:attribute>
						<xsl:attribute name="text-align-last">justify</xsl:attribute>
						<xsl:attribute name="padding-top">3px</xsl:attribute>
					
						<fo:inline>
							 <fo:basic-link>
							 	<xsl:attribute name="external-destination">url('https://github.com/esig/dss')</xsl:attribute>
							 	Generated by DSS v.${project.version}
							 </fo:basic-link>
							 <xsl:text>with validation time </xsl:text><xsl:value-of select="@ValidationTime" />
						</fo:inline>
						
						<fo:leader/>

						<fo:inline>
							<fo:page-number />
							/
							<fo:page-number-citation>
								<xsl:attribute name="ref-id">theEnd</xsl:attribute>
							</fo:page-number-citation> 
						</fo:inline>
					</fo:block>
				</fo:static-content>

				<fo:flow>
					<xsl:attribute name="flow-name">xsl-region-body</xsl:attribute>
					<xsl:attribute name="font-size">8pt</xsl:attribute>
					
					<xsl:apply-templates select="dss:Certificate"/>
					<xsl:apply-templates select="dss:BasicBuildingBlocks[@Type='CERTIFICATE']"/>
					
					<xsl:apply-templates select="dss:Signature"/>
					<xsl:apply-templates select="dss:Timestamp"/>
				    <xsl:apply-templates select="dss:BasicBuildingBlocks[@Type='SIGNATURE']"/>
				    <xsl:apply-templates select="dss:BasicBuildingBlocks[@Type='COUNTER_SIGNATURE']"/>
				    <xsl:apply-templates select="dss:BasicBuildingBlocks[@Type='TIMESTAMP']"/>
				    <xsl:apply-templates select="dss:BasicBuildingBlocks[@Type='REVOCATION']"/>
				    
   					<xsl:apply-templates select="dss:TLAnalysis"/>
	    			
   					<xsl:if test="dss:Semantic">
   						
						<fo:block>
							<xsl:attribute name="keep-together.within-page">always</xsl:attribute>
							<xsl:attribute name="font-weight">bold</xsl:attribute>
							<xsl:attribute name="margin-top">25px</xsl:attribute>
				       		<xsl:attribute name="margin-bottom">2px</xsl:attribute>
				       		<xsl:attribute name="color">#004494</xsl:attribute>
				       		
				       		<xsl:attribute name="border-bottom-style">solid</xsl:attribute>
				       		<xsl:attribute name="border-color">#004494</xsl:attribute>
				       		<xsl:attribute name="border-width">1px</xsl:attribute>
   					
   							Semantics
   						</fo:block>
						
						<xsl:apply-templates select="dss:Semantic"/>
   					</xsl:if>
					
					<fo:block>
						<xsl:attribute name="id">theEnd</xsl:attribute>
					</fo:block>
				</fo:flow>
			</fo:page-sequence>
		</fo:root>
	</xsl:template>
	
	<xsl:template match="dss:BasicBuildingBlocks">
		<fo:block>
			<xsl:attribute name="keep-together.within-page">always</xsl:attribute>
			<xsl:attribute name="font-weight">bold</xsl:attribute>
			<xsl:attribute name="margin-top">4px</xsl:attribute>
       		<xsl:attribute name="margin-bottom">2px</xsl:attribute>
       		<xsl:attribute name="color">#004494</xsl:attribute>
       		
       		<xsl:attribute name="border-bottom-style">solid</xsl:attribute>
       		<xsl:attribute name="border-color">#004494</xsl:attribute>
       		<xsl:attribute name="border-width">1px</xsl:attribute>
       		
    		Basic Building Blocks
    		<fo:block>
    			<xsl:attribute name="font-size">7pt</xsl:attribute>
    			<xsl:value-of select="@Type"/> - <xsl:value-of select="@Id"/>
    		</fo:block>
    	</fo:block>

       	<xsl:apply-templates/>
    </xsl:template>
    
	<xsl:template match="dss:TLAnalysis">
		<fo:block>
			<xsl:attribute name="keep-together.within-page">always</xsl:attribute>
			<xsl:attribute name="font-weight">bold</xsl:attribute>
			<xsl:attribute name="margin-top">4px</xsl:attribute>
       		<xsl:attribute name="margin-bottom">2px</xsl:attribute>
       		<xsl:attribute name="color">#004494</xsl:attribute>
       		
       		<xsl:attribute name="border-bottom-style">solid</xsl:attribute>
       		<xsl:attribute name="border-color">#004494</xsl:attribute>
       		<xsl:attribute name="border-width">1px</xsl:attribute>
       		
       		<xsl:value-of select="@Title"/>
    	</fo:block>

       	<xsl:apply-templates/>
    </xsl:template>
    
    <xsl:template match="dss:Signature|dss:Timestamp">
	    
		<fo:table table-layout="fixed">
			<xsl:attribute name="margin-top">4px</xsl:attribute>
			<xsl:attribute name="margin-bottom">2px</xsl:attribute>
			
			<fo:table-body>
				<xsl:attribute name="start-indent">0</xsl:attribute>
				<xsl:attribute name="end-indent">0</xsl:attribute>
				
				<fo:table-row>
					<fo:table-cell>
						<fo:block>
							<xsl:attribute name="keep-with-next">always</xsl:attribute>
							<xsl:attribute name="font-weight">bold</xsl:attribute>
				       		
				       		<xsl:attribute name="border-bottom-style">solid</xsl:attribute>
				       		<xsl:attribute name="border-color">#004494</xsl:attribute>
				       		<xsl:attribute name="border-width">1px</xsl:attribute>
				       		
							<xsl:attribute name="margin-bottom">2px</xsl:attribute>
				       		
				       		<xsl:value-of select="name(.)" />
							<xsl:text> </xsl:text>
				       		<xsl:value-of select="@Id" />
				    	</fo:block>
	    			</fo:table-cell>
				</fo:table-row>
			</fo:table-body>
		</fo:table>
    	
		<fo:block-container>
       		<xsl:attribute name="border-left-style">solid</xsl:attribute>
       		<xsl:attribute name="border-color">#004494</xsl:attribute>
       		<xsl:attribute name="border-width">1px</xsl:attribute>
       		
			<xsl:attribute name="margin-top">4px</xsl:attribute>
			<xsl:attribute name="margin-bottom">2px</xsl:attribute>
       		
			<fo:block-container>
				<xsl:attribute name="margin-left">10px</xsl:attribute>
				<fo:block-container>
					<xsl:attribute name="margin">0</xsl:attribute>
				
					<fo:block>
			       		<xsl:apply-templates/>
			       	</fo:block>
		       	</fo:block-container>
	       	</fo:block-container>
	       	
    	</fo:block-container>
	    	
    </xsl:template>
    
	<xsl:template match="dss:ValidationProcessBasicSignature|dss:ValidationProcessTimestamp|dss:ValidationProcessLongTermData|dss:ValidationProcessArchivalData|dss:Certificate">
	
		<xsl:variable name="indicationText" select="dss:Conclusion/dss:Indication/text()"/>
        <xsl:variable name="indicationColor">
        	<xsl:choose>
				<xsl:when test="$indicationText='PASSED'">green</xsl:when>
				<xsl:when test="$indicationText='INDETERMINATE'">orange</xsl:when>
				<xsl:when test="$indicationText='FAILED'">red</xsl:when>
				<xsl:otherwise>grey</xsl:otherwise>
			</xsl:choose>
        </xsl:variable>

		<fo:table table-layout="fixed">
			<xsl:attribute name="keep-with-next">always</xsl:attribute>
			<xsl:attribute name="page-break-inside">avoid</xsl:attribute>
			
			<xsl:attribute name="margin-top">4px</xsl:attribute>
			<xsl:attribute name="margin-bottom">2px</xsl:attribute>
			
			<fo:table-column>
				<xsl:attribute name="column-width">60%</xsl:attribute>
			</fo:table-column>
			<fo:table-column>
				<xsl:attribute name="column-width">40%</xsl:attribute>
			</fo:table-column>
			
			<fo:table-body>
				<xsl:attribute name="start-indent">0</xsl:attribute>
				<xsl:attribute name="end-indent">0</xsl:attribute>
				
		    	<fo:table-row>
					<fo:table-cell>
						<fo:block>
		    				<xsl:attribute name="font-weight">bold</xsl:attribute>

				       		<xsl:value-of select="@Title" />

							<xsl:if test="dss:ProofOfExistence/dss:Time">
								<fo:inline>
									<xsl:attribute name="font-weight">normal</xsl:attribute>
									<xsl:attribute name="font-size">6pt</xsl:attribute>
									(Best signature time : <xsl:value-of select="dss:ProofOfExistence/dss:Time" />)
								</fo:inline>
							</xsl:if>

							<xsl:if test="@ProductionTime">
								<fo:inline>
									<xsl:attribute name="font-weight">normal</xsl:attribute>
									<xsl:attribute name="font-size">6pt</xsl:attribute>
									(Production time : <xsl:value-of select="@ProductionTime"/>)
								</fo:inline>
							</xsl:if>
			       		</fo:block>
					</fo:table-cell>
					<fo:table-cell>
						<fo:block>
		    				<xsl:attribute name="font-weight">bold</xsl:attribute>
							<xsl:attribute name="color"><xsl:value-of select="$indicationColor" /></xsl:attribute>
							<xsl:attribute name="text-align">right</xsl:attribute>
							
							<xsl:value-of select="dss:Conclusion/dss:Indication" />
							
							<xsl:if test="string-length(dss:Conclusion/dss:SubIndication) &gt; 0">
								<xsl:text> - </xsl:text>
								<xsl:value-of select="dss:Conclusion/dss:SubIndication"/>
							</xsl:if>
						</fo:block>
					</fo:table-cell>
				</fo:table-row>

			</fo:table-body>
		</fo:table>
    	
		<fo:block-container>
       		<xsl:attribute name="border-left-style">solid</xsl:attribute>
       		<xsl:attribute name="border-color">#004494</xsl:attribute>
       		<xsl:attribute name="border-width">1px</xsl:attribute>
       		
			<xsl:attribute name="margin-top">2px</xsl:attribute>
			<xsl:attribute name="margin-bottom">2px</xsl:attribute>
       		
			<fo:block-container>
				<xsl:attribute name="margin-left">10px</xsl:attribute>
				<fo:block-container>
					<xsl:attribute name="margin">0</xsl:attribute>
					<fo:block>
			       		<xsl:apply-templates/>
			       	</fo:block>
		       	</fo:block-container>
	       	</fo:block-container>
	       	
    	</fo:block-container>
    	
    </xsl:template>
    
    <xsl:template match="dss:ValidationSignatureQualification|dss:ValidationTimestampQualification|dss:ValidationCertificateQualification">
    	<fo:table table-layout="fixed">
			<xsl:attribute name="keep-with-next">always</xsl:attribute>
			<xsl:attribute name="page-break-inside">avoid</xsl:attribute>
			
			<xsl:attribute name="margin-top">4px</xsl:attribute>
			<xsl:attribute name="margin-bottom">2px</xsl:attribute>
			
			<fo:table-column>
				<xsl:attribute name="column-width">60%</xsl:attribute>
			</fo:table-column>
			<fo:table-column>
				<xsl:attribute name="column-width">40%</xsl:attribute>
			</fo:table-column>
    
    		<fo:table-body>
				<xsl:attribute name="start-indent">0</xsl:attribute>
				<xsl:attribute name="end-indent">0</xsl:attribute>
				
		    	<fo:table-row>
					<fo:table-cell>
						<fo:block>
		    				<xsl:attribute name="font-weight">bold</xsl:attribute>
    
    						<xsl:value-of select="@Title" />
							<xsl:if test="@DateTime">
								<fo:inline>
									<xsl:attribute name="font-weight">normal</xsl:attribute>
									<xsl:attribute name="font-size">6pt</xsl:attribute>
									(<xsl:value-of select="@DateTime" />)
								</fo:inline>
							</xsl:if>
   						</fo:block>
    				</fo:table-cell>
    				
					<fo:table-cell>
						<fo:block>
		    				<xsl:attribute name="font-weight">bold</xsl:attribute>
							<xsl:attribute name="text-align">right</xsl:attribute>
		    				
		    				<xsl:choose>
					    		<xsl:when test="@SignatureQualification">
					       			<xsl:value-of select="@SignatureQualification"/>
					       		</xsl:when>
					    		<xsl:when test="@TimestampQualification">
					       			<xsl:value-of select="@TimestampQualification"/>
					       		</xsl:when>
					    		<xsl:when test="@CertificateQualification">
					       			<xsl:value-of select="@CertificateQualification"/>
					       		</xsl:when>
				       		</xsl:choose>
			       		</fo:block>
					</fo:table-cell>
				</fo:table-row>


			</fo:table-body>
		</fo:table>

    	
		<fo:block-container>
       		<xsl:attribute name="border-left-style">solid</xsl:attribute>
       		<xsl:attribute name="border-color">#004494</xsl:attribute>
       		<xsl:attribute name="border-width">1px</xsl:attribute>
       		
			<xsl:attribute name="margin-top">2px</xsl:attribute>
			<xsl:attribute name="margin-bottom">2px</xsl:attribute>
       		
			<fo:block-container>
				<xsl:attribute name="margin-left">10px</xsl:attribute>
				<fo:block-container>
					<xsl:attribute name="margin">0</xsl:attribute>
					<fo:block>
			       		<xsl:apply-templates/>
			       	</fo:block>
		       	</fo:block-container>
	       	</fo:block-container>
	       	
    	</fo:block-container>

    </xsl:template>
     
    <xsl:template match="dss:FC|dss:ISC|dss:VCI|dss:RAC|dss:RFC|dss:CV|dss:SAV|dss:XCV|dss:SubXCV|dss:PSV|dss:PCV|dss:VTS">
		<xsl:variable name="indicationText" select="dss:Conclusion/dss:Indication"/>
        <xsl:variable name="indicationColor">
        	<xsl:choose>
				<xsl:when test="$indicationText='PASSED'">green</xsl:when>
				<xsl:when test="$indicationText='INDETERMINATE'">orange</xsl:when>
				<xsl:when test="$indicationText='FAILED'">red</xsl:when>
				<xsl:otherwise>grey</xsl:otherwise>
			</xsl:choose>
        </xsl:variable>
        
    	<fo:table table-layout="fixed">
			<xsl:attribute name="keep-together.within-page">always</xsl:attribute>
			
			<xsl:attribute name="margin-top">4px</xsl:attribute>
			<xsl:attribute name="margin-bottom">2px</xsl:attribute>
			
			<fo:table-column>
				<xsl:attribute name="column-width">60%</xsl:attribute>
			</fo:table-column>
			<fo:table-column>
				<xsl:attribute name="column-width">40%</xsl:attribute>
			</fo:table-column>
			
			<fo:table-body>
				<xsl:attribute name="start-indent">0</xsl:attribute>
				<xsl:attribute name="end-indent">0</xsl:attribute>
				
		    	<fo:table-row>
					
					<fo:table-cell>
						<fo:block>
		    				<xsl:attribute name="font-weight">bold</xsl:attribute>
		       		
		    				<xsl:choose>
								<xsl:when test="name(.) = 'SubXCV'">
									<xsl:choose>
										<xsl:when test="@TrustAnchor ='true'">Trust Anchor (<xsl:value-of select="@Id"/>)</xsl:when>
										<xsl:otherwise>Certificate <xsl:value-of select="@Id"/> :</xsl:otherwise>
									</xsl:choose>
									
									<xsl:if test="@SelfSigned ='true'"> (Self Signed)</xsl:if>
									<xsl:if test="dss:CrossCertificate">
										<fo:block>
			    							<xsl:attribute name="font-weight">normal</xsl:attribute>
											<xsl:text>&#xa;Cross certification: </xsl:text><xsl:value-of select="dss:CrossCertificate"/>
										</fo:block>
									</xsl:if>
									<xsl:if test="dss:EquivalentCertificate">
										<fo:block>
			    							<xsl:attribute name="font-weight">normal</xsl:attribute>
											<xsl:text>&#xa;Equivalent certification: </xsl:text><xsl:value-of select="dss:EquivalentCertificate"/>
										</fo:block>
									</xsl:if>
								</xsl:when>
								<xsl:otherwise>
									<xsl:value-of select="@Title"/> :
								</xsl:otherwise>
							</xsl:choose>
						</fo:block>
					</fo:table-cell>
					<fo:table-cell>
						<fo:block>
		    				<xsl:attribute name="font-weight">bold</xsl:attribute>
							<xsl:attribute name="text-align">right</xsl:attribute>
							<xsl:attribute name="color"><xsl:value-of select="$indicationColor" /></xsl:attribute>
							
							<xsl:choose>
								<xsl:when test="string-length(dss:Conclusion/dss:SubIndication) &gt; 0">
									<xsl:value-of select="dss:Conclusion/dss:SubIndication"/>
								</xsl:when>
								<xsl:otherwise>
									<xsl:value-of select="dss:Conclusion/dss:Indication" />
								</xsl:otherwise>
							</xsl:choose>
						</fo:block>
					</fo:table-cell>
				</fo:table-row>	
				
			</fo:table-body>
		</fo:table>
		
		<fo:block-container>
       		<xsl:attribute name="border-left-style">solid</xsl:attribute>
       		<xsl:attribute name="border-color">#004494</xsl:attribute>
       		<xsl:attribute name="border-width">1px</xsl:attribute>
       		
			<xsl:attribute name="margin-top">2px</xsl:attribute>
			<xsl:attribute name="margin-bottom">2px</xsl:attribute>
       		
			<fo:block-container>
				<xsl:attribute name="margin-left">10px</xsl:attribute>
				<fo:block-container>
					<xsl:attribute name="margin">0</xsl:attribute>
					
					<fo:block>
			       		<xsl:apply-templates/>
			       	</fo:block>
		       	</fo:block-container>
	       	</fo:block-container>
	       	
    	</fo:block-container>
		
    </xsl:template>
    
    <xsl:template match="dss:Constraint">
    	<fo:table table-layout="fixed">
			<xsl:attribute name="keep-together.within-page">always</xsl:attribute>
    	
			<fo:table-column>
				<xsl:attribute name="column-width">65%</xsl:attribute>
			</fo:table-column>
			<fo:table-column>
				<xsl:attribute name="column-width">35%</xsl:attribute>
			</fo:table-column>
    	
			<fo:table-body>
				<xsl:attribute name="start-indent">0</xsl:attribute>
				<xsl:attribute name="end-indent">0</xsl:attribute>

				<xsl:variable name="statusText" select="dss:Status"/>
				
		    	<fo:table-row>
					<fo:table-cell>
						<xsl:attribute name="display-align">center</xsl:attribute>
						
						<fo:block>
		    				<xsl:attribute name="font-weight">normal</xsl:attribute>
    						<xsl:attribute name="font-size">7pt</xsl:attribute>
		    				
							<xsl:value-of select="dss:Name"/>
						</fo:block>
					</fo:table-cell>
					<fo:table-cell>
						<xsl:attribute name="display-align">center</xsl:attribute>
						
						<fo:block>
		    				<xsl:attribute name="font-weight">normal</xsl:attribute>
							<xsl:attribute name="font-size">7pt</xsl:attribute>
							<xsl:attribute name="text-align">right</xsl:attribute>

				        	<xsl:choose>
								<xsl:when test="$statusText='OK'">
									<fo:instream-foreign-object fox:alt-text="OK" content-height="7px" content-width="7px" height="7px" width="7px">
										<svg viewBox="0 0 1792 1792" xmlns="http://www.w3.org/2000/svg"><path style="fill:green" d="M1412 734q0-28-18-46l-91-90q-19-19-45-19t-45 19l-408 407-226-226q-19-19-45-19t-45 19l-91 90q-18 18-18 46 0 27 18 45l362 362q19 19 45 19 27 0 46-19l543-543q18-18 18-45zm252 162q0 209-103 385.5t-279.5 279.5-385.5 103-385.5-103-279.5-279.5-103-385.5 103-385.5 279.5-279.5 385.5-103 385.5 103 279.5 279.5 103 385.5z"/></svg>
									</fo:instream-foreign-object>
								</xsl:when>
								<xsl:when test="$statusText='NOT OK'">
									<fo:instream-foreign-object fox:alt-text="{dss:Error}" content-height="7px" content-width="7px" height="7px" width="7px">
										<svg viewBox="0 0 1792 1792" xmlns="http://www.w3.org/2000/svg"><path style="fill:red" d="M1277 1122q0-26-19-45l-181-181 181-181q19-19 19-45 0-27-19-46l-90-90q-19-19-46-19-26 0-45 19l-181 181-181-181q-19-19-45-19-27 0-46 19l-90 90q-19 19-19 46 0 26 19 45l181 181-181 181q-19 19-19 45 0 27 19 46l90 90q19 19 46 19 26 0 45-19l181-181 181 181q19 19 45 19 27 0 46-19l90-90q19-19 19-46zm387-226q0 209-103 385.5t-279.5 279.5-385.5 103-385.5-103-279.5-279.5-103-385.5 103-385.5 279.5-279.5 385.5-103 385.5 103 279.5 279.5 103 385.5z"/></svg>
									</fo:instream-foreign-object>
								</xsl:when>
								<xsl:when test="$statusText='WARNING'">
									<fo:instream-foreign-object fox:alt-text="{dss:Warning}" content-height="7px" content-width="7px" height="7px" width="7px">
										<svg viewBox="0 0 1792 1792" xmlns="http://www.w3.org/2000/svg"><path style="fill:orange" d="M896 128q209 0 385.5 103t279.5 279.5 103 385.5-103 385.5-279.5 279.5-385.5 103-385.5-103-279.5-279.5-103-385.5 103-385.5 279.5-279.5 385.5-103zm128 1247v-190q0-14-9-23.5t-22-9.5h-192q-13 0-23 10t-10 23v190q0 13 10 23t23 10h192q13 0 22-9.5t9-23.5zm-2-344l18-621q0-12-10-18-10-8-24-8h-220q-14 0-24 8-10 6-10 18l17 621q0 10 10 17.5t24 7.5h185q14 0 23.5-7.5t10.5-17.5z"/></svg>
									</fo:instream-foreign-object>
								</xsl:when>
								<xsl:when test="$statusText='INFORMATION'">
									<fo:instream-foreign-object fox:alt-text="{dss:Info}" content-height="7px" content-width="7px" height="7px" width="7px">
										<svg viewBox="0 0 1792 1792" xmlns="http://www.w3.org/2000/svg"><path style="fill:dodgerblue" d="M1152 1376v-160q0-14-9-23t-23-9h-96v-512q0-14-9-23t-23-9h-320q-14 0-23 9t-9 23v160q0 14 9 23t23 9h96v320h-96q-14 0-23 9t-9 23v160q0 14 9 23t23 9h448q14 0 23-9t9-23zm-128-896v-160q0-14-9-23t-23-9h-192q-14 0-23 9t-9 23v160q0 14 9 23t23 9h192q14 0 23-9t9-23zm640 416q0 209-103 385.5t-279.5 279.5-385.5 103-385.5-103-279.5-279.5-103-385.5 103-385.5 279.5-279.5 385.5-103 385.5 103 279.5 279.5 103 385.5z"/></svg>
									</fo:instream-foreign-object>
								</xsl:when>
								<xsl:when test="$statusText='IGNORED'">
									<fo:instream-foreign-object fox:alt-text="IGNORED" content-height="7px" content-width="7px" height="7px" width="7px">
										<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1792 1792"><path style="fill:grey" d="M555 1335l78-141q-87-63-136-159t-49-203q0-121 61-225-229 117-381 353 167 258 427 375zm389-759q0-20-14-34t-34-14q-125 0-214.5 89.5t-89.5 214.5q0 20 14 34t34 14 34-14 14-34q0-86 61-147t147-61q20 0 34-14t14-34zm363-191q0 7-1 9-106 189-316 567t-315 566l-49 89q-10 16-28 16-12 0-134-70-16-10-16-28 0-12 44-87-143-65-263.5-173t-208.5-245q-20-31-20-69t20-69q153-235 380-371t496-136q89 0 180 17l54-97q10-16 28-16 5 0 18 6t31 15.5 33 18.5 31.5 18.5 19.5 11.5q16 10 16 27zm37 447q0 139-79 253.5t-209 164.5l280-502q8 45 8 84zm448 128q0 35-20 69-39 64-109 145-150 172-347.5 267t-419.5 95l74-132q212-18 392.5-137t301.5-307q-115-179-282-294l63-112q95 64 182.5 153t144.5 184q20 34 20 69z"></path></svg>
									</fo:instream-foreign-object>
								</xsl:when>
								<xsl:otherwise>
									<xsl:value-of select="dss:Status" />
								</xsl:otherwise>
				    		</xsl:choose>
							
						</fo:block>
					</fo:table-cell>
				</fo:table-row>

				<xsl:if test="dss:AdditionalInfo or ($statusText != 'OK' and $statusText != 'IGNORED')">
					<fo:table-row>
						<fo:table-cell>
							<xsl:attribute name="display-align">before</xsl:attribute>
							<xsl:attribute name="padding-top">-1px</xsl:attribute>

							<fo:block>
								<xsl:attribute name="font-weight">normal</xsl:attribute>
								<xsl:attribute name="font-size">6pt</xsl:attribute>
								<xsl:attribute name="color">grey</xsl:attribute>

								<xsl:value-of select="dss:AdditionalInfo"/>
							</fo:block>
						</fo:table-cell>
						<fo:table-cell>
							<xsl:attribute name="display-align">before</xsl:attribute>
							<xsl:attribute name="padding-top">-1px</xsl:attribute>

							<fo:block>
								<xsl:attribute name="font-weight">normal</xsl:attribute>
								<xsl:attribute name="font-size">6pt</xsl:attribute>
								<xsl:attribute name="text-align">right</xsl:attribute>

								<xsl:choose>
									<xsl:when test="$statusText='NOT OK'">
										<xsl:attribute name="color">red</xsl:attribute>
										<xsl:value-of select="dss:Error"/>
									</xsl:when>
									<xsl:when test="$statusText='WARNING'">
										<xsl:attribute name="color">orange</xsl:attribute>
										<xsl:value-of select="dss:Warning"/>
									</xsl:when>
									<xsl:when test="$statusText='INFORMATION'">
										<xsl:attribute name="color">blue</xsl:attribute>
										<xsl:value-of select="dss:Info"/>
									</xsl:when>
								</xsl:choose>

							</fo:block>
						</fo:table-cell>
					</fo:table-row>
				</xsl:if>

			</fo:table-body>
		</fo:table>
    </xsl:template>
	 
    <xsl:template match="dss:Semantic">
    
    	<fo:table table-layout="fixed">
    	
			<fo:table-column>
				<xsl:attribute name="column-width">30%</xsl:attribute>
			</fo:table-column>
			<fo:table-column>
				<xsl:attribute name="column-width">70%</xsl:attribute>
			</fo:table-column>
    	
			<fo:table-body>
				<xsl:attribute name="start-indent">0</xsl:attribute>
				<xsl:attribute name="end-indent">0</xsl:attribute>
				
		    	<fo:table-row>
					<fo:table-cell>
						<xsl:attribute name="display-align">center</xsl:attribute>
						
						<fo:block>
		    				<xsl:attribute name="font-weight">bold</xsl:attribute>
    						<xsl:attribute name="font-size">7pt</xsl:attribute>
       						<xsl:attribute name="margin-bottom">2px</xsl:attribute>
		    				
							<xsl:value-of select="@Key"/>
						</fo:block>
					</fo:table-cell>
					<fo:table-cell>
						<xsl:attribute name="display-align">center</xsl:attribute>
						
						<fo:block>
		    				<xsl:attribute name="font-weight">normal</xsl:attribute>
							<xsl:attribute name="font-size">7pt</xsl:attribute>
       						<xsl:attribute name="margin-bottom">2px</xsl:attribute>
							
							<xsl:value-of select="."/>
						</fo:block>
					</fo:table-cell>
				</fo:table-row>
			</fo:table-body>
		</fo:table>    
    
    </xsl:template>
    
    <xsl:template match="dss:Conclusion" />
    <xsl:template match="dss:ProofOfExistence" />
    <xsl:template match="dss:CryptographicInfo" />
    <xsl:template match="dss:CertificateChain" />
    <xsl:template match="dss:RevocationProductionDate" />
    <xsl:template match="dss:RevocationInfo" />
    <xsl:template match="dss:CrossCertificate" />
    <xsl:template match="dss:EquivalentCertificate" />
    
</xsl:stylesheet>

