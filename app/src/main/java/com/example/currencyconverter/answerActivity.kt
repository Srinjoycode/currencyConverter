package com.example.currencyconverter

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import java.text.DecimalFormat

class answerActivity : AppCompatActivity() {
    var userName = ""
    var exchangeRate = 0.0
    var OtherCurrency = ""
    var checkedSwitch = true
    @SuppressLint("SetTextI18n")
    fun onRadioButtonClicked(view: View) {
        // Is the button now checked?
        val checked = (view as RadioButton).isChecked
        // Check which radio button was clicked
        val conversionSettings = findViewById<TextView>(R.id.convertSystem)
        conversionSettings.text = "From " + userName + "to " + OtherCurrency
        val inversionSwitch = findViewById<Switch>(R.id.directionSwitcher)
        inversionSwitch.isChecked = false
        if ("INR(Rupee)" == userName) {
            when (view.getId()) {
                R.id.USD -> {
                    if (checked) {
                        exchangeRate = 0.013
                        OtherCurrency = "USD"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                    if (checked) {
                        exchangeRate = 0.012
                        OtherCurrency = "EUR"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                    if (checked) {
                        exchangeRate = 0.011
                        OtherCurrency = "GBP"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                    if (checked) {
                        exchangeRate = 1.0
                        OtherCurrency = "INR"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                }
                R.id.EUR -> {
                    if (checked) {
                        exchangeRate = 0.012
                        OtherCurrency = "EUR"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                    if (checked) {
                        exchangeRate = 0.011
                        OtherCurrency = "GBP"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                    if (checked) {
                        exchangeRate = 1.0
                        OtherCurrency = "INR"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                }
                R.id.GBP -> {
                    if (checked) {
                        exchangeRate = 0.011
                        OtherCurrency = "GBP"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                    if (checked) {
                        exchangeRate = 1.0
                        OtherCurrency = "INR"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                }
                R.id.INR -> if (checked) {
                    exchangeRate = 1.0
                    OtherCurrency = "INR"
                    if (checkedSwitch) {
                        conversionSettings.text = "From " + userName + "to " + OtherCurrency
                    } else {
                        conversionSettings.text = "From " + OtherCurrency + "to " + userName
                    }

                }
            }
        } else if ("USD(Dollar)" == userName) {
            when (view.getId()) {
                R.id.USD -> {
                    if (checked) {
                        exchangeRate = 1.0
                        OtherCurrency = "USD"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                    if (checked) {
                        exchangeRate = 0.92
                        OtherCurrency = "EUR"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                    if (checked) {
                        exchangeRate = .83
                        OtherCurrency = "GBP"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                    if (checked) {
                        exchangeRate = 75.88
                        OtherCurrency = "INR"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                }
                R.id.EUR -> {
                    if (checked) {
                        exchangeRate = 0.92
                        OtherCurrency = "EUR"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                    if (checked) {
                        exchangeRate = .83
                        OtherCurrency = "GBP"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                    if (checked) {
                        exchangeRate = 75.88
                        OtherCurrency = "INR"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                }
                R.id.GBP -> {
                    if (checked) {
                        exchangeRate = .83
                        OtherCurrency = "GBP"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                    if (checked) {
                        exchangeRate = 75.88
                        OtherCurrency = "INR"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                }
                R.id.INR -> if (checked) {
                    exchangeRate = 75.88
                    OtherCurrency = "INR"
                    if (checkedSwitch) {
                        conversionSettings.text = "From " + userName + "to " + OtherCurrency
                    } else {
                        conversionSettings.text = "From " + OtherCurrency + "to " + userName
                    }

                }
            }
        } else if ("GBP(Pound)" == userName) {
            when (view.getId()) {
                R.id.USD -> {
                    if (checked) {
                        exchangeRate = 1.21
                        OtherCurrency = "USD"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                    if (checked) {
                        exchangeRate = 1.12
                        OtherCurrency = "EUR"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                    if (checked) {
                        exchangeRate = 1.0
                        OtherCurrency = "GBP"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                    if (checked) {
                        exchangeRate = 91.84
                        OtherCurrency = "INR"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                }
                R.id.EUR -> {
                    if (checked) {
                        exchangeRate = 1.12
                        OtherCurrency = "EUR"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                    if (checked) {
                        exchangeRate = 1.0
                        OtherCurrency = "GBP"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                    if (checked) {
                        exchangeRate = 91.84
                        OtherCurrency = "INR"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                }
                R.id.GBP -> {
                    if (checked) {
                        exchangeRate = 1.0
                        OtherCurrency = "GBP"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                    if (checked) {
                        exchangeRate = 91.84
                        OtherCurrency = "INR"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                }
                R.id.INR -> if (checked) {
                    exchangeRate = 91.84
                    OtherCurrency = "INR"
                    if (checkedSwitch) {
                        conversionSettings.text = "From " + userName + "to " + OtherCurrency
                    } else {
                        conversionSettings.text = "From " + OtherCurrency + "to " + userName
                    }

                }
            }
        } else if ("EUR(Euro)" == userName) {
            when (view.getId()) {
                R.id.USD -> {
                    if (checked) {
                        exchangeRate = 1.08
                        OtherCurrency = "USD"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                    if (checked) {
                        exchangeRate = 1.0
                        OtherCurrency = "EUR"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                    if (checked) {
                        exchangeRate = 0.89
                        OtherCurrency = "GBP"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                    if (checked) {
                        exchangeRate = 82.11
                        OtherCurrency = "INR"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                }
                R.id.EUR -> {
                    if (checked) {
                        exchangeRate = 1.0
                        OtherCurrency = "EUR"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                    if (checked) {
                        exchangeRate = 0.89
                        OtherCurrency = "GBP"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                    if (checked) {
                        exchangeRate = 82.11
                        OtherCurrency = "INR"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                }
                R.id.GBP -> {
                    if (checked) {
                        exchangeRate = 0.89
                        OtherCurrency = "GBP"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                    if (checked) {
                        exchangeRate = 82.11
                        OtherCurrency = "INR"
                        if (checkedSwitch) {
                            conversionSettings.text = "From " + userName + "to " + OtherCurrency
                        } else {
                            conversionSettings.text = "From " + OtherCurrency + "to " + userName
                        }

                    }
                }
                R.id.INR -> if (checked) {
                    exchangeRate = 82.11
                    OtherCurrency = "INR"
                    if (checkedSwitch) {
                        conversionSettings.text = "From " + userName + "to " + OtherCurrency
                    } else {
                        conversionSettings.text = "From " + OtherCurrency + "to " + userName
                    }

                }
            }
        }
    }

    fun onConvert(view: View?) {
        Log.i("info", userName)
        val yourCurrency = findViewById<EditText>(R.id.yourCurrency)
        val convertedCurrency = findViewById<TextView>(R.id.convertedCurrencyText)
        val inversionSwitch = findViewById<Switch>(R.id.directionSwitcher)
        val groupButtons = findViewById<RadioGroup>(R.id.otherCurrencySelector)
        val conversionSettings = findViewById<TextView>(R.id.convertSystem)
        val convertButton = findViewById<Button>(R.id.buttonConvert)
        inversionSwitch.visibility = View.VISIBLE
        conversionSettings.text = "From " + userName + "to " + OtherCurrency
        val CurrencyYour = yourCurrency.text.toString().toDouble()
        Log.i("info", exchangeRate.toString())
        if (exchangeRate == 0.0) {
            Toast.makeText(this, "please select a currency to convert to", Toast.LENGTH_SHORT).show()
        }
        conversionSettings.text = "From " + userName + "to " + OtherCurrency
        val converted = CurrencyYour * exchangeRate
        val formatter = DecimalFormat("##.##")
        convertedCurrency.text = formatter.format(converted)
        inversionSwitch.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                checkedSwitch = true
                val converted = CurrencyYour / exchangeRate //conversion
                conversionSettings.text = "From " + OtherCurrency + "to " + userName
                val formatter = DecimalFormat("##.##")
                convertedCurrency.text = formatter.format(converted)
            } else {
                checkedSwitch = false
                conversionSettings.text = "From " + userName + "to " + OtherCurrency
                val converted = CurrencyYour * exchangeRate
                val formatter = DecimalFormat("##.##")
                convertedCurrency.text = formatter.format(converted)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer)
        val caller = intent
        userName = caller.getStringExtra("currencyUser")
    }
}