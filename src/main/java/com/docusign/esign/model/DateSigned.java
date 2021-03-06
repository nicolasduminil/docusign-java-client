package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.MergeField;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-06T16:42:36.211-08:00")
public class DateSigned   {
  
  private String anchorCaseSensitive = null;
  private String anchorHorizontalAlignment = null;
  private String anchorIgnoreIfNotPresent = null;
  private String anchorMatchWholeWord = null;
  private String anchorString = null;
  private String anchorUnits = null;
  private String anchorXOffset = null;
  private String anchorYOffset = null;
  private String bold = null;
  private String conditionalParentLabel = null;
  private String conditionalParentValue = null;
  private String customTabId = null;
  private String documentId = null;
  private ErrorDetails errorDetails = null;
  private String font = null;
  private String fontColor = null;
  private String fontSize = null;
  private String italic = null;
  private MergeField mergeField = null;
  private String name = null;
  private String pageNumber = null;
  private String recipientId = null;
  private String status = null;
  private String tabId = null;
  private String tabLabel = null;
  private String tabOrder = null;
  private String templateLocked = null;
  private String templateRequired = null;
  private String underline = null;
  private String value = null;
  private String xPosition = null;
  private String yPosition = null;

  
  /**
   * When set to **true**, the anchor string does not consider case when matching strings in the document. The default value is **true**.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the anchor string does not consider case when matching strings in the document. The default value is **true**.")
  @JsonProperty("anchorCaseSensitive")
  public String getAnchorCaseSensitive() {
    return anchorCaseSensitive;
  }
  public void setAnchorCaseSensitive(String anchorCaseSensitive) {
    this.anchorCaseSensitive = anchorCaseSensitive;
  }

  
  /**
   * Specifies the alignment of anchor tabs with anchor strings. Possible values are **left** or **right**. The default value is **left**.
   **/
  
  @ApiModelProperty(value = "Specifies the alignment of anchor tabs with anchor strings. Possible values are **left** or **right**. The default value is **left**.")
  @JsonProperty("anchorHorizontalAlignment")
  public String getAnchorHorizontalAlignment() {
    return anchorHorizontalAlignment;
  }
  public void setAnchorHorizontalAlignment(String anchorHorizontalAlignment) {
    this.anchorHorizontalAlignment = anchorHorizontalAlignment;
  }

  
  /**
   * When set to **true**, this tab is ignored if anchorString is not found in the document.
   **/
  
  @ApiModelProperty(value = "When set to **true**, this tab is ignored if anchorString is not found in the document.")
  @JsonProperty("anchorIgnoreIfNotPresent")
  public String getAnchorIgnoreIfNotPresent() {
    return anchorIgnoreIfNotPresent;
  }
  public void setAnchorIgnoreIfNotPresent(String anchorIgnoreIfNotPresent) {
    this.anchorIgnoreIfNotPresent = anchorIgnoreIfNotPresent;
  }

  
  /**
   * When set to **true**, the anchor string in this tab matches whole words only (strings embedded in other strings are ignored.) The default value is **true**.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the anchor string in this tab matches whole words only (strings embedded in other strings are ignored.) The default value is **true**.")
  @JsonProperty("anchorMatchWholeWord")
  public String getAnchorMatchWholeWord() {
    return anchorMatchWholeWord;
  }
  public void setAnchorMatchWholeWord(String anchorMatchWholeWord) {
    this.anchorMatchWholeWord = anchorMatchWholeWord;
  }

  
  /**
   * Anchor text information for a radio button.
   **/
  
  @ApiModelProperty(value = "Anchor text information for a radio button.")
  @JsonProperty("anchorString")
  public String getAnchorString() {
    return anchorString;
  }
  public void setAnchorString(String anchorString) {
    this.anchorString = anchorString;
  }

  
  /**
   * Specifies units of the X and Y offset. Units could be pixels, millimeters, centimeters, or inches.
   **/
  
  @ApiModelProperty(value = "Specifies units of the X and Y offset. Units could be pixels, millimeters, centimeters, or inches.")
  @JsonProperty("anchorUnits")
  public String getAnchorUnits() {
    return anchorUnits;
  }
  public void setAnchorUnits(String anchorUnits) {
    this.anchorUnits = anchorUnits;
  }

  
  /**
   * Specifies the X axis location of the tab, in achorUnits, relative to the anchorString.
   **/
  
  @ApiModelProperty(value = "Specifies the X axis location of the tab, in achorUnits, relative to the anchorString.")
  @JsonProperty("anchorXOffset")
  public String getAnchorXOffset() {
    return anchorXOffset;
  }
  public void setAnchorXOffset(String anchorXOffset) {
    this.anchorXOffset = anchorXOffset;
  }

  
  /**
   * Specifies the Y axis location of the tab, in achorUnits, relative to the anchorString.
   **/
  
  @ApiModelProperty(value = "Specifies the Y axis location of the tab, in achorUnits, relative to the anchorString.")
  @JsonProperty("anchorYOffset")
  public String getAnchorYOffset() {
    return anchorYOffset;
  }
  public void setAnchorYOffset(String anchorYOffset) {
    this.anchorYOffset = anchorYOffset;
  }

  
  /**
   * When set to **true**, the information in the tab is bold.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the information in the tab is bold.")
  @JsonProperty("bold")
  public String getBold() {
    return bold;
  }
  public void setBold(String bold) {
    this.bold = bold;
  }

  
  /**
   * For conditional fields this is the TabLabel of the parent tab that controls this tab's visibility.
   **/
  
  @ApiModelProperty(value = "For conditional fields this is the TabLabel of the parent tab that controls this tab's visibility.")
  @JsonProperty("conditionalParentLabel")
  public String getConditionalParentLabel() {
    return conditionalParentLabel;
  }
  public void setConditionalParentLabel(String conditionalParentLabel) {
    this.conditionalParentLabel = conditionalParentLabel;
  }

  
  /**
   * For conditional fields, this is the value of the parent tab that controls the tab's visibility.\n\nIf the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use \"on\" as the value to show that the parent tab is active.
   **/
  
  @ApiModelProperty(value = "For conditional fields, this is the value of the parent tab that controls the tab's visibility.\n\nIf the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use \"on\" as the value to show that the parent tab is active.")
  @JsonProperty("conditionalParentValue")
  public String getConditionalParentValue() {
    return conditionalParentValue;
  }
  public void setConditionalParentValue(String conditionalParentValue) {
    this.conditionalParentValue = conditionalParentValue;
  }

  
  /**
   * The DocuSign generated custom tab ID for the custom tab to be applied. This can only be used when adding new tabs for a recipient. When used, the new tab inherits all the custom tab properties.
   **/
  
  @ApiModelProperty(value = "The DocuSign generated custom tab ID for the custom tab to be applied. This can only be used when adding new tabs for a recipient. When used, the new tab inherits all the custom tab properties.")
  @JsonProperty("customTabId")
  public String getCustomTabId() {
    return customTabId;
  }
  public void setCustomTabId(String customTabId) {
    this.customTabId = customTabId;
  }

  
  /**
   * Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.
   **/
  
  @ApiModelProperty(value = "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
  @JsonProperty("documentId")
  public String getDocumentId() {
    return documentId;
  }
  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  
  /**
   * The font to be used for the tab value. Supported Fonts: Arial, Arial, ArialNarrow, Calibri, CourierNew, Garamond, Georgia, Helvetica,   LucidaConsole, Tahoma, TimesNewRoman, Trebuchet, Verdana, MSGothic, MSMincho, Default.
   **/
  
  @ApiModelProperty(value = "The font to be used for the tab value. Supported Fonts: Arial, Arial, ArialNarrow, Calibri, CourierNew, Garamond, Georgia, Helvetica,   LucidaConsole, Tahoma, TimesNewRoman, Trebuchet, Verdana, MSGothic, MSMincho, Default.")
  @JsonProperty("font")
  public String getFont() {
    return font;
  }
  public void setFont(String font) {
    this.font = font;
  }

  
  /**
   * The font color used for the information in the tab.\n\nPossible values are: Black, BrightBlue, BrightRed, DarkGreen, DarkRed, Gold, Green, NavyBlue, Purple, or White.
   **/
  
  @ApiModelProperty(value = "The font color used for the information in the tab.\n\nPossible values are: Black, BrightBlue, BrightRed, DarkGreen, DarkRed, Gold, Green, NavyBlue, Purple, or White.")
  @JsonProperty("fontColor")
  public String getFontColor() {
    return fontColor;
  }
  public void setFontColor(String fontColor) {
    this.fontColor = fontColor;
  }

  
  /**
   * The font size used for the information in the tab.\n\nPossible values are: Size7, Size8, Size9, Size10, Size11, Size12, Size14, Size16, Size18, Size20, Size22, Size24, Size26, Size28, Size36, Size48, or Size72.
   **/
  
  @ApiModelProperty(value = "The font size used for the information in the tab.\n\nPossible values are: Size7, Size8, Size9, Size10, Size11, Size12, Size14, Size16, Size18, Size20, Size22, Size24, Size26, Size28, Size36, Size48, or Size72.")
  @JsonProperty("fontSize")
  public String getFontSize() {
    return fontSize;
  }
  public void setFontSize(String fontSize) {
    this.fontSize = fontSize;
  }

  
  /**
   * When set to **true**, the information in the tab is italic.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the information in the tab is italic.")
  @JsonProperty("italic")
  public String getItalic() {
    return italic;
  }
  public void setItalic(String italic) {
    this.italic = italic;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mergeField")
  public MergeField getMergeField() {
    return mergeField;
  }
  public void setMergeField(MergeField mergeField) {
    this.mergeField = mergeField;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Specifies the page number on which the tab is located.
   **/
  
  @ApiModelProperty(value = "Specifies the page number on which the tab is located.")
  @JsonProperty("pageNumber")
  public String getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
  }

  
  /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.
   **/
  
  @ApiModelProperty(value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  @JsonProperty("recipientId")
  public String getRecipientId() {
    return recipientId;
  }
  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  
  /**
   * Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.
   **/
  
  @ApiModelProperty(value = "Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call].
   **/
  
  @ApiModelProperty(value = "The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call].")
  @JsonProperty("tabId")
  public String getTabId() {
    return tabId;
  }
  public void setTabId(String tabId) {
    this.tabId = tabId;
  }

  
  /**
   * The label string associated with the tab.
   **/
  
  @ApiModelProperty(value = "The label string associated with the tab.")
  @JsonProperty("tabLabel")
  public String getTabLabel() {
    return tabLabel;
  }
  public void setTabLabel(String tabLabel) {
    this.tabLabel = tabLabel;
  }

  
  /**
   * 
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tabOrder")
  public String getTabOrder() {
    return tabOrder;
  }
  public void setTabOrder(String tabOrder) {
    this.tabOrder = tabOrder;
  }

  
  /**
   * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients.")
  @JsonProperty("templateLocked")
  public String getTemplateLocked() {
    return templateLocked;
  }
  public void setTemplateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
  }

  
  /**
   * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.")
  @JsonProperty("templateRequired")
  public String getTemplateRequired() {
    return templateRequired;
  }
  public void setTemplateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
  }

  
  /**
   * When set to **true**, the information in the tab is underlined.
   **/
  
  @ApiModelProperty(value = "When set to **true**, the information in the tab is underlined.")
  @JsonProperty("underline")
  public String getUnderline() {
    return underline;
  }
  public void setUnderline(String underline) {
    this.underline = underline;
  }

  
  /**
   * Specifies the value of the tab.
   **/
  
  @ApiModelProperty(value = "Specifies the value of the tab.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  
  /**
   * This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position.
   **/
  
  @ApiModelProperty(value = "This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position.")
  @JsonProperty("xPosition")
  public String getXPosition() {
    return xPosition;
  }
  public void setXPosition(String xPosition) {
    this.xPosition = xPosition;
  }

  
  /**
   * This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.
   **/
  
  @ApiModelProperty(value = "This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.")
  @JsonProperty("yPosition")
  public String getYPosition() {
    return yPosition;
  }
  public void setYPosition(String yPosition) {
    this.yPosition = yPosition;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateSigned dateSigned = (DateSigned) o;

    return true && Objects.equals(anchorCaseSensitive, dateSigned.anchorCaseSensitive) &&
        Objects.equals(anchorHorizontalAlignment, dateSigned.anchorHorizontalAlignment) &&
        Objects.equals(anchorIgnoreIfNotPresent, dateSigned.anchorIgnoreIfNotPresent) &&
        Objects.equals(anchorMatchWholeWord, dateSigned.anchorMatchWholeWord) &&
        Objects.equals(anchorString, dateSigned.anchorString) &&
        Objects.equals(anchorUnits, dateSigned.anchorUnits) &&
        Objects.equals(anchorXOffset, dateSigned.anchorXOffset) &&
        Objects.equals(anchorYOffset, dateSigned.anchorYOffset) &&
        Objects.equals(bold, dateSigned.bold) &&
        Objects.equals(conditionalParentLabel, dateSigned.conditionalParentLabel) &&
        Objects.equals(conditionalParentValue, dateSigned.conditionalParentValue) &&
        Objects.equals(customTabId, dateSigned.customTabId) &&
        Objects.equals(documentId, dateSigned.documentId) &&
        Objects.equals(errorDetails, dateSigned.errorDetails) &&
        Objects.equals(font, dateSigned.font) &&
        Objects.equals(fontColor, dateSigned.fontColor) &&
        Objects.equals(fontSize, dateSigned.fontSize) &&
        Objects.equals(italic, dateSigned.italic) &&
        Objects.equals(mergeField, dateSigned.mergeField) &&
        Objects.equals(name, dateSigned.name) &&
        Objects.equals(pageNumber, dateSigned.pageNumber) &&
        Objects.equals(recipientId, dateSigned.recipientId) &&
        Objects.equals(status, dateSigned.status) &&
        Objects.equals(tabId, dateSigned.tabId) &&
        Objects.equals(tabLabel, dateSigned.tabLabel) &&
        Objects.equals(tabOrder, dateSigned.tabOrder) &&
        Objects.equals(templateLocked, dateSigned.templateLocked) &&
        Objects.equals(templateRequired, dateSigned.templateRequired) &&
        Objects.equals(underline, dateSigned.underline) &&
        Objects.equals(value, dateSigned.value) &&
        Objects.equals(xPosition, dateSigned.xPosition) &&
        Objects.equals(yPosition, dateSigned.yPosition)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchorCaseSensitive, anchorHorizontalAlignment, anchorIgnoreIfNotPresent, anchorMatchWholeWord, anchorString, anchorUnits, anchorXOffset, anchorYOffset, bold, conditionalParentLabel, conditionalParentValue, customTabId, documentId, errorDetails, font, fontColor, fontSize, italic, mergeField, name, pageNumber, recipientId, status, tabId, tabLabel, tabOrder, templateLocked, templateRequired, underline, value, xPosition, yPosition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateSigned {\n");
    
    if (anchorCaseSensitive != null)
      sb.append("    anchorCaseSensitive: ").append(toIndentedString(anchorCaseSensitive)).append("\n");
    if (anchorHorizontalAlignment != null)
      sb.append("    anchorHorizontalAlignment: ").append(toIndentedString(anchorHorizontalAlignment)).append("\n");
    if (anchorIgnoreIfNotPresent != null)
      sb.append("    anchorIgnoreIfNotPresent: ").append(toIndentedString(anchorIgnoreIfNotPresent)).append("\n");
    if (anchorMatchWholeWord != null)
      sb.append("    anchorMatchWholeWord: ").append(toIndentedString(anchorMatchWholeWord)).append("\n");
    if (anchorString != null)
      sb.append("    anchorString: ").append(toIndentedString(anchorString)).append("\n");
    if (anchorUnits != null)
      sb.append("    anchorUnits: ").append(toIndentedString(anchorUnits)).append("\n");
    if (anchorXOffset != null)
      sb.append("    anchorXOffset: ").append(toIndentedString(anchorXOffset)).append("\n");
    if (anchorYOffset != null)
      sb.append("    anchorYOffset: ").append(toIndentedString(anchorYOffset)).append("\n");
    if (bold != null)
      sb.append("    bold: ").append(toIndentedString(bold)).append("\n");
    if (conditionalParentLabel != null)
      sb.append("    conditionalParentLabel: ").append(toIndentedString(conditionalParentLabel)).append("\n");
    if (conditionalParentValue != null)
      sb.append("    conditionalParentValue: ").append(toIndentedString(conditionalParentValue)).append("\n");
    if (customTabId != null)
      sb.append("    customTabId: ").append(toIndentedString(customTabId)).append("\n");
    if (documentId != null)
      sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    if (errorDetails != null)
      sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    if (font != null)
      sb.append("    font: ").append(toIndentedString(font)).append("\n");
    if (fontColor != null)
      sb.append("    fontColor: ").append(toIndentedString(fontColor)).append("\n");
    if (fontSize != null)
      sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    if (italic != null)
      sb.append("    italic: ").append(toIndentedString(italic)).append("\n");
    if (mergeField != null)
      sb.append("    mergeField: ").append(toIndentedString(mergeField)).append("\n");
    if (name != null)
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
    if (pageNumber != null)
      sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    if (recipientId != null)
      sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    if (status != null)
      sb.append("    status: ").append(toIndentedString(status)).append("\n");
    if (tabId != null)
      sb.append("    tabId: ").append(toIndentedString(tabId)).append("\n");
    if (tabLabel != null)
      sb.append("    tabLabel: ").append(toIndentedString(tabLabel)).append("\n");
    if (tabOrder != null)
      sb.append("    tabOrder: ").append(toIndentedString(tabOrder)).append("\n");
    if (templateLocked != null)
      sb.append("    templateLocked: ").append(toIndentedString(templateLocked)).append("\n");
    if (templateRequired != null)
      sb.append("    templateRequired: ").append(toIndentedString(templateRequired)).append("\n");
    if (underline != null)
      sb.append("    underline: ").append(toIndentedString(underline)).append("\n");
    if (value != null)
      sb.append("    value: ").append(toIndentedString(value)).append("\n");
    if (xPosition != null)
      sb.append("    xPosition: ").append(toIndentedString(xPosition)).append("\n");
    if (yPosition != null)
      sb.append("    yPosition: ").append(toIndentedString(yPosition)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

