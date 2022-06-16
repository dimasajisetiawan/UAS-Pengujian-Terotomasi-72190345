import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://genesis.dutatani.id/si_petani/login.php?pesan=Mohon%20Login')

WebUI.setText(findTestObject('Object Repository/Input Petani Berhasil/Page_/input_ID User_id_user'), 'admin_ptn')

WebUI.setEncryptedText(findTestObject('Object Repository/Input Petani Berhasil/Page_/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Input Petani Berhasil/Page_/input_Password_btn btn-primary btn-lg'))

WebUI.click(findTestObject('Object Repository/Input Petani Berhasil/Page_/a_Pendataan Petani'))

WebUI.setText(findTestObject('Object Repository/Input Petani Berhasil/Page_/input_Id User_id_user (1)'), id_user)

WebUI.setText(findTestObject('Object Repository/Input Petani Berhasil/Page_/input_Nama Petani_nama_petani'), nama_petani)

WebUI.focus(findTestObject('Object Repository/Input Petani Berhasil/Page_/datePicker'))

WebUI.setText(findTestObject('Object Repository/Input Petani Berhasil/Page_/datePicker'), '01/11/2018')

WebUI.setText(findTestObject('Object Repository/Input Petani Berhasil/Page_/input_Nama Istri  Suami_nama_istri'), 'angel')

WebUI.setText(findTestObject('Object Repository/Input Petani Berhasil/Page_/input_Alamat Petani_alamat_petani'), 'bantul')

WebUI.selectOptionByValue(findTestObject('Object Repository/Input Petani Berhasil/Page_/select_Provinsi                            _919ea7'), 
    'DI YOGYAKARTA', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Input Petani Berhasil/Page_/select_KabupatenKABUPATEN BANTULKABUPATEN G_999db8'), 
    'KABUPATEN BANTUL', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Input Petani Berhasil/Page_/select_KecamatanSRANDAKANSANDENKRETEKPUNDON_96a685'), 
    'BANTUL', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Input Petani Berhasil/Page_/select_Desa  KelurahanBANTULPALBAPANGRINGIN_8e45f9'), 
    'BANTUL', true)

WebUI.setText(findTestObject('Object Repository/Input Petani Berhasil/Page_/input_Nomor Telepon_nomor_telpon'), '0888888888888')

WebUI.setText(findTestObject('Object Repository/Input Petani Berhasil/Page_/input_Jumlah Lahan_jml_lahan'), '1')

WebUI.setText(findTestObject('Object Repository/Input Petani Berhasil/Page_/input_Jumlah Tanggungan_jumlah_tanggungan'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Input Petani Berhasil/Page_/input_Jumlah Tenaga Kerja Musiman_jml_tng_k_49b205'), 
    '0')

WebUI.setText(findTestObject('Object Repository/Input Petani Berhasil/Page_/input_Email_email'), 'jolie@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Input Petani Berhasil/Page_/select_Islam                               _f363b0'), 
    'Hindu', true)

WebUI.click(findTestObject('Object Repository/Input Petani Berhasil/Page_/div_Deskripsi Keahlian'))

WebUI.setText(findTestObject('Object Repository/Input Petani Berhasil/Page_/textarea_Deskripsi Keahlian_deskripsi_keahlian'), 
    'jolie jolie')

WebUI.click(findTestObject('Object Repository/Input Petani Berhasil/Page_/label_Aktif'))

WebUI.click(findTestObject('Object Repository/Input Petani Berhasil/Page_/label_Laki-laki'))

WebUI.click(findTestObject('Object Repository/Input Petani Berhasil/Page_/div_Foto'))

WebUI.click(findTestObject('Object Repository/Input Petani Berhasil/Page_/input_Password_btn btn-primary btn-lg'))

