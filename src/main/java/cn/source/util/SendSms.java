package cn.source.util;

//import com.aliyuncs.DefaultAcsClient;
//import com.aliyuncs.IAcsClient;
//import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
//import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
//import com.aliyuncs.exceptions.ClientException;
//import com.aliyuncs.exceptions.ServerException;
//import com.aliyuncs.http.MethodType;
//import com.aliyuncs.profile.DefaultProfile;
//import com.aliyuncs.profile.IClientProfile;

public class SendSms {
	
	
//	public void aa() {
//		String sms = sms("15703708538", "", "");
//		System.out.println("");
//		
//		
//	}
	
//	public String sms(String phoneNum,String SignName,String TemplateCode) {
//		//���ó�ʱʱ��-�����е���
//		System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
//		System.setProperty("sun.net.client.defaultReadTimeout", "10000");
//		//��ʼ��ascClient��Ҫ�ļ�������
//		final String product = "Dysmsapi";//����API��Ʒ���ƣ����Ų�Ʒ���̶��������޸ģ�
//		final String domain = "dysmsapi.aliyuncs.com";//����API��Ʒ�������ӿڵ�ַ�̶��������޸ģ�
//		//�滻�����AK
//		final String accessKeyId = "LTAIvrBG06MGk3Tn";//���accessKeyId,�ο����ĵ�����2
//		final String accessKeySecret = "8FxjvHUEBIJo4dTb5BLyRoWojlQXUG";//���accessKeySecret���ο����ĵ�����2
//		//��ʼ��ascClient,��ʱ��֧�ֶ�region�������޸ģ�
//		IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId,
//		accessKeySecret);
//		try {
//			DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
//		} catch (ClientException e1) {
//			e1.printStackTrace();
//			return "��ʼ��ascClient����";
//		}
//		IAcsClient acsClient = new DefaultAcsClient(profile);
//		 //��װ�������
//		 SendSmsRequest request = new SendSmsRequest();
//		 //ʹ��post�ύ
//		 request.setMethod(MethodType.POST);
//		 //����:�������ֻ��š�֧���Զ��ŷָ�����ʽ�����������ã���������Ϊ1000���ֻ�����,������������ڵ������ü�ʱ�������ӳ�,��֤�����͵Ķ����Ƽ�ʹ�õ������õķ�ʽ�����͹���/�۰�̨��Ϣʱ�����պ����ʽΪ��������+���룬�硰85200000000��
//		 request.setPhoneNumbers(phoneNum);
//		 //����:����ǩ��-���ڶ��ſ���̨���ҵ�
//		 request.setSignName(SignName);
//		 //����:����ģ��-���ڶ��ſ���̨���ҵ������͹���/�۰�̨��Ϣʱ����ʹ�ù���/�۰�̨����ģ��
//		 request.setTemplateCode(TemplateCode);
//		 //��ѡ:ģ���еı����滻JSON��,��ģ������Ϊ"�װ���${name},������֤��Ϊ${code}"ʱ,�˴���ֵΪ
//		 //������ʾ:���JSON����Ҫ�����з�,����ձ�׼��JSONЭ��Ի��з���Ҫ��,������������а���\r\n�������JSON����Ҫ��ʾ��\\r\\n,����ᵼ��JSON�ڷ���˽���ʧ��
//		 request.setTemplateParam("{\"name\":\"Tom\", \"code\":\"123\"}");
//		 //��ѡ-���ж�����չ��(��չ���ֶο�����7λ�����£������������û�����Դ��ֶ�)
//		 //request.setSmsUpExtendCode("90997");
//		 //��ѡ:outIdΪ�ṩ��ҵ����չ�ֶ�,�����ڶ��Ż�ִ��Ϣ�н���ֵ���ظ�������
//		 request.setOutId("yourOutId");
//		//����ʧ���������ClientException�쳣
//		SendSmsResponse sendSmsResponse;
//		try {
//			sendSmsResponse = acsClient.getAcsResponse(request);
//		} catch (ServerException e) {
//			e.printStackTrace();
//			return "�������쳣";
//		} catch (ClientException e) {
//			e.printStackTrace();
//			return "����ʧ��";
//		}
//		if(sendSmsResponse.getCode() != null && sendSmsResponse.getCode().equals("OK")) {
//		//����ɹ�
//			System.out.println("��"+phoneNum+"������֤�룬�ɹ���");
//		}
//		
//		return sendSmsResponse.getCode();
//	}

}
