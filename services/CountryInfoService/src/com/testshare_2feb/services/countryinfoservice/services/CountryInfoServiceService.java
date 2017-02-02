/**This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

package com.testshare_2feb.services.countryinfoservice.services;
import com.testshare_2feb.services.countryinfoservice.*;
import java.util.List;

import com.wavemaker.runtime.soap.util.SoapSettingsResolver;
import com.wavemaker.runtime.soap.SoapServiceSettings;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import javax.xml.ws.BindingProvider;



@Service
public class CountryInfoServiceService{

    @Autowired
    @Qualifier("CountryInfoServiceSoapServiceSettings")
    private SoapServiceSettings soapServiceSettings;


	public ListOfCountryNamesGroupedByContinentResponse listOfCountryNamesGroupedByContinent(  com.testshare_2feb.services.countryinfoservice.ListOfCountryNamesGroupedByContinent parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.listOfCountryNamesGroupedByContinent(parameters );
	}

	public CountryFlagResponse countryFlag(  com.testshare_2feb.services.countryinfoservice.CountryFlag parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.countryFlag(parameters );
	}

	public ListOfCountryNamesByNameResponse listOfCountryNamesByName(  com.testshare_2feb.services.countryinfoservice.ListOfCountryNamesByName parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.listOfCountryNamesByName(parameters );
	}

	public CountryNameResponse countryName(  com.testshare_2feb.services.countryinfoservice.CountryName parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.countryName(parameters );
	}

	public LanguageISOCodeResponse languageISOCode(  com.testshare_2feb.services.countryinfoservice.LanguageISOCode parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.languageISOCode(parameters );
	}

	public CountryCurrencyResponse countryCurrency(  com.testshare_2feb.services.countryinfoservice.CountryCurrency parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.countryCurrency(parameters );
	}

	public CurrencyNameResponse currencyName(  com.testshare_2feb.services.countryinfoservice.CurrencyName parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.currencyName(parameters );
	}

	public ListOfLanguagesByNameResponse listOfLanguagesByName(  com.testshare_2feb.services.countryinfoservice.ListOfLanguagesByName parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.listOfLanguagesByName(parameters );
	}

	public FullCountryInfoAllCountriesResponse fullCountryInfoAllCountries(  com.testshare_2feb.services.countryinfoservice.FullCountryInfoAllCountries parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.fullCountryInfoAllCountries(parameters );
	}

	public ListOfCountryNamesByCodeResponse listOfCountryNamesByCode(  com.testshare_2feb.services.countryinfoservice.ListOfCountryNamesByCode parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.listOfCountryNamesByCode(parameters );
	}

	public ListOfCurrenciesByNameResponse listOfCurrenciesByName(  com.testshare_2feb.services.countryinfoservice.ListOfCurrenciesByName parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.listOfCurrenciesByName(parameters );
	}

	public FullCountryInfoResponse fullCountryInfo(  com.testshare_2feb.services.countryinfoservice.FullCountryInfo parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.fullCountryInfo(parameters );
	}

	public ListOfContinentsByCodeResponse listOfContinentsByCode(  com.testshare_2feb.services.countryinfoservice.ListOfContinentsByCode parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.listOfContinentsByCode(parameters );
	}

	public ListOfCurrenciesByCodeResponse listOfCurrenciesByCode(  com.testshare_2feb.services.countryinfoservice.ListOfCurrenciesByCode parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.listOfCurrenciesByCode(parameters );
	}

	public LanguageNameResponse languageName(  com.testshare_2feb.services.countryinfoservice.LanguageName parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.languageName(parameters );
	}

	public CountryISOCodeResponse countryISOCode(  com.testshare_2feb.services.countryinfoservice.CountryISOCode parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.countryISOCode(parameters );
	}

	public ListOfContinentsByNameResponse listOfContinentsByName(  com.testshare_2feb.services.countryinfoservice.ListOfContinentsByName parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.listOfContinentsByName(parameters );
	}

	public CountryIntPhoneCodeResponse countryIntPhoneCode(  com.testshare_2feb.services.countryinfoservice.CountryIntPhoneCode parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.countryIntPhoneCode(parameters );
	}

	public ListOfLanguagesByCodeResponse listOfLanguagesByCode(  com.testshare_2feb.services.countryinfoservice.ListOfLanguagesByCode parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.listOfLanguagesByCode(parameters );
	}

	public CountriesUsingCurrencyResponse countriesUsingCurrency(  com.testshare_2feb.services.countryinfoservice.CountriesUsingCurrency parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.countriesUsingCurrency(parameters );
	}

	public CapitalCityResponse capitalCity(  com.testshare_2feb.services.countryinfoservice.CapitalCity parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.capitalCity(parameters );
	}
}