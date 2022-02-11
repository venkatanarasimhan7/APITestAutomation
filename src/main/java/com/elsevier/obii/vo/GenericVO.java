
package com.elsevier.obii.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.services.admin.vo.AddressVO;
import com.elsevier.obii.services.admin.vo.EmailAddressVO;
import com.elsevier.obii.services.admin.vo.FTPAddressVO;
import com.elsevier.obii.services.admin.vo.PersonVO;
import com.elsevier.obii.services.admin.vo.PhysicalAddressVO;
import com.elsevier.obii.services.admin.vo.UserDetailsVO;
import com.elsevier.obii.services.admin.vo.UserLocationBriefDetailsVO;
import com.elsevier.obii.services.common.vo.CodeListDetailsVO;
import com.elsevier.obii.services.common.vo.CodeListItemDetailsVO;
import com.elsevier.obii.services.common.vo.ElsevierOrgUnitVO;
import com.elsevier.obii.services.common.vo.PartyInfoVO;
import com.elsevier.obii.services.common.vo.ScheduleTaskInputVO;
import com.elsevier.obii.services.common.vo.SupplierInfoVO;
import com.elsevier.obii.services.common.vo.TimeTableActionVO;
import com.elsevier.obii.services.outputorder.vo.AddOutputOrderEventVO;
import com.elsevier.obii.services.outputorder.vo.AttachToDoListInputVO;
import com.elsevier.obii.services.outputorder.vo.AttachmentTypeVO;
import com.elsevier.obii.services.outputorder.vo.CancelDataDeliveryInputVO;
import com.elsevier.obii.services.outputorder.vo.CancelOutputOrderVO;
import com.elsevier.obii.services.outputorder.vo.ChangeOutputOrderDetailsVO;
import com.elsevier.obii.services.outputorder.vo.ChangeRequestInputVO;
import com.elsevier.obii.services.outputorder.vo.CommonOrderAndUserDetailsVO;
import com.elsevier.obii.services.outputorder.vo.ContactPersonVO;
import com.elsevier.obii.services.outputorder.vo.CopyChangeOutputOrderInputVO;
import com.elsevier.obii.services.outputorder.vo.CopyChangeOutputOrderOutputVO;
import com.elsevier.obii.services.outputorder.vo.CopyOutputOrderOutputVO;
import com.elsevier.obii.services.outputorder.vo.CreateExternalDeliveryOrderInputVO;
import com.elsevier.obii.services.outputorder.vo.CreateExternalDeliveryOrderOutputVO;
import com.elsevier.obii.services.outputorder.vo.CreateExternalFormatAndDeliveryOrderInputVO;
import com.elsevier.obii.services.outputorder.vo.CreateExternalFormatAndDeliveryOrderOutputVO;
import com.elsevier.obii.services.outputorder.vo.CustomFormattingInstructionVO;
import com.elsevier.obii.services.outputorder.vo.CustomFormattingOrderInputVO;
import com.elsevier.obii.services.outputorder.vo.CustomFormattingOrderOutputVO;
import com.elsevier.obii.services.outputorder.vo.CustomerDetailsVO;
import com.elsevier.obii.services.outputorder.vo.DataDeliverySectionVO;
import com.elsevier.obii.services.outputorder.vo.DataElementsVO;
import com.elsevier.obii.services.outputorder.vo.DataScopeVO;
import com.elsevier.obii.services.outputorder.vo.DateRangeVO;
import com.elsevier.obii.services.outputorder.vo.DeliveryInstructionVO;
import com.elsevier.obii.services.outputorder.vo.DeliveryNotificationEmailVO;
import com.elsevier.obii.services.outputorder.vo.EmailNotificationVO;
import com.elsevier.obii.services.outputorder.vo.ExportDataInputVO;
import com.elsevier.obii.services.outputorder.vo.ExtractDeliveryDataInputVO;
import com.elsevier.obii.services.outputorder.vo.ExtractDeliveryDataOutputVO;
import com.elsevier.obii.services.outputorder.vo.OutputAttachmentVO;
import com.elsevier.obii.services.outputorder.vo.OutputChangeRequestDetailsVO;
import com.elsevier.obii.services.outputorder.vo.OutputDeliveryDetailsVO;
import com.elsevier.obii.services.outputorder.vo.OutputDeliveryFrequencyVO;
import com.elsevier.obii.services.outputorder.vo.OutputIndexVO;
import com.elsevier.obii.services.outputorder.vo.OutputOrderApprovalVO;
import com.elsevier.obii.services.outputorder.vo.OutputOrderDeliveryInfoVO;
import com.elsevier.obii.services.outputorder.vo.OutputOrderDeliveryInputVO;
import com.elsevier.obii.services.outputorder.vo.OutputOrderDetailsVO;
import com.elsevier.obii.services.outputorder.vo.OutputOrderFinalizationInputVO;
import com.elsevier.obii.services.outputorder.vo.OutputOrderResultsVO;
import com.elsevier.obii.services.outputorder.vo.OutputOrderSearchParamVO;
import com.elsevier.obii.services.outputorder.vo.OutputRequestDetailsVO;
import com.elsevier.obii.services.outputorder.vo.ProcessSupplierOrderInputVO;
import com.elsevier.obii.services.outputorder.vo.ProfileInputVO;
import com.elsevier.obii.services.outputorder.vo.RecordTypeVO;
import com.elsevier.obii.services.outputorder.vo.RegisterDataDeliveryInputVO;
import com.elsevier.obii.services.outputorder.vo.RequestFormVO;
import com.elsevier.obii.services.outputorder.vo.RequestOrderApproveVO;
import com.elsevier.obii.services.outputorder.vo.RequestOrderInputVO;
import com.elsevier.obii.services.outputorder.vo.RequestOrderOutputVO;
import com.elsevier.obii.services.outputorder.vo.SearchOrderListInputVO;
import com.elsevier.obii.services.outputorder.vo.SearchOrderListOutputVO;
import com.elsevier.obii.services.outputorder.vo.SearchProfileDetailsVO;
import com.elsevier.obii.services.outputorder.vo.UpdateOrderStatusVO;
import com.elsevier.obii.services.outputorder.vo.UpdateOrderTypeVO;
import com.elsevier.obii.services.outputorder.vo.UpdateOutputOrderVO;
import com.elsevier.obii.services.outputorder.vo.UpdateProductionOrderRequestVO;


/**
 * <p>Java class for GenericVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericVO")
@XmlSeeAlso({
    TimeTableActionVO.class,
    CodeListDetailsVO.class,
    CodeListItemDetailsVO.class,
    ScheduleTaskInputVO.class,
    ElsevierOrgUnitVO.class,
    SupplierInfoVO.class,
    PartyInfoVO.class,
    UserLocationBriefDetailsVO.class,
    UserDetailsVO.class,
    FTPAddressVO.class,
    PersonVO.class,
    AddressVO.class,
    EmailAddressVO.class,
    PhysicalAddressVO.class,
    UserVO.class,
    FileInfoVO.class,
    NameValueMapVO.class,
    EmailNotificationVO.class,
    CustomFormattingOrderInputVO.class,
    CustomFormattingOrderOutputVO.class,
    CommonOrderAndUserDetailsVO.class,
    SearchProfileDetailsVO.class,
    DataDeliverySectionVO.class,
    OutputDeliveryDetailsVO.class,
    UpdateOrderTypeVO.class,
    SearchOrderListInputVO.class,
    SearchOrderListOutputVO.class,
    RequestOrderInputVO.class,
    CustomFormattingInstructionVO.class,
    DataElementsVO.class,
    DeliveryInstructionVO.class,
    DateRangeVO.class,
    RecordTypeVO.class,
    RequestOrderOutputVO.class,
    UpdateOutputOrderVO.class,
    AttachToDoListInputVO.class,
    ExtractDeliveryDataInputVO.class,
    RegisterDataDeliveryInputVO.class,
    CreateExternalFormatAndDeliveryOrderInputVO.class,
    CreateExternalFormatAndDeliveryOrderOutputVO.class,
    UpdateProductionOrderRequestVO.class,
    ChangeOutputOrderDetailsVO.class,
    OutputOrderDetailsVO.class,
    OutputRequestDetailsVO.class,
    OutputAttachmentVO.class,
    ContactPersonVO.class,
    CustomerDetailsVO.class,
    OutputIndexVO.class,
    DataScopeVO.class,
    AttachmentTypeVO.class,
    OutputChangeRequestDetailsVO.class,
    CopyOutputOrderOutputVO.class,
    RequestFormVO.class,
    CreateExternalDeliveryOrderInputVO.class,
    CreateExternalDeliveryOrderOutputVO.class,
    ProfileInputVO.class,
    OutputOrderResultsVO.class,
    CancelOutputOrderVO.class,
    OutputOrderDeliveryInputVO.class,
    CancelDataDeliveryInputVO.class,
    ProcessSupplierOrderInputVO.class,
    CopyChangeOutputOrderInputVO.class,
    CopyChangeOutputOrderOutputVO.class,
    RequestOrderApproveVO.class,
    OutputOrderSearchParamVO.class,
    ExportDataInputVO.class,
    ChangeRequestInputVO.class,
    OutputOrderDeliveryInfoVO.class,
    DeliveryNotificationEmailVO.class,
    OutputOrderApprovalVO.class,
    AddOutputOrderEventVO.class,
    OutputOrderFinalizationInputVO.class,
    OutputDeliveryFrequencyVO.class,
    ExtractDeliveryDataOutputVO.class,
    UpdateOrderStatusVO.class
})
public class GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;

}
