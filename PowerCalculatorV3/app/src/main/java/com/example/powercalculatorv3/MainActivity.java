package com.example.powercalculatorv3;





import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends Activity 
	{
	
		
		RadioGroup rb1,rb2,rb3;
		RadioButton selectedRadio1,selectedRadio2,selectedRadio3;
		
		Button butonCompute,butonClear;
		TextView textViewRezultat;
		
		EditText etConsum,etRunTime,etPrice,etVat;
		
		@Override
		protected void onCreate(Bundle savedInstanceState) 
			{
				super.onCreate(savedInstanceState);
				setContentView(R.layout.activity_main);
		
				if (savedInstanceState == null) 
					{
						getFragmentManager().beginTransaction().add(R.id.container, new PlaceholderFragment()).commit();
					}
				
				butonCompute = (Button)findViewById(R.id.button2);
				butonClear = (Button)findViewById(R.id.button1);
				
				
			
				}
			 	public void actiune(View V)
			 	{
			 		
			 		rb1 =(RadioGroup)findViewById(R.id.radioGroup1);
			 		rb2 =(RadioGroup)findViewById(R.id.radioGroup2);
					rb3 =(RadioGroup)findViewById(R.id.radioGroup3);
					
					etConsum = (EditText)findViewById(R.id.editText1);
					etRunTime = (EditText)findViewById(R.id.editText2);
					etPrice = (EditText)findViewById(R.id.editText3);
					etVat = (EditText)findViewById(R.id.editText4);
					
					
					
					textViewRezultat =(TextView)findViewById(R.id.textView7);
					
			 		int selectedId1 = rb1.getCheckedRadioButtonId();
					selectedRadio1 = (RadioButton)findViewById(selectedId1);
					
					int selectedId2 = rb2.getCheckedRadioButtonId();
					selectedRadio2 = (RadioButton)findViewById(selectedId2);
					
					int selectedId3 = rb3.getCheckedRadioButtonId();
					selectedRadio3 = (RadioButton)findViewById(selectedId3);
				
					
					
					String string1 = etConsum.getText().toString();
					String string2 = etRunTime.getText().toString();
					String string3 = etPrice.getText().toString();
					String string4 = etVat.getText().toString();
					
					if(string1.equals("") || string2.equals("") || string3.equals("") || string4.equals(""))
					
						{
							Toast.makeText(MainActivity.this,"All fields must be filled !", Toast.LENGTH_SHORT).show();
						}
					else	
						{
						float valuare1 = Float.parseFloat(etConsum.getText().toString());
						float valuare2 = Float.parseFloat(etRunTime.getText().toString());
						float valuare3 = Float.parseFloat(etPrice.getText().toString());
						float valuare4 = Float.parseFloat(etVat.getText().toString());
						
							if(selectedRadio3.getText().equals("Watt/h"))
								{
									if(selectedRadio1.getText().equals("Watts"))
										{
											float time= 0;
											if(selectedRadio2.getText().equals("days"))
												{
													time =24*valuare2;
												}
											if(selectedRadio2.getText().equals("weeks"))
												{
													time = 24*7*valuare2;
												}
											if(selectedRadio2.getText().equals("months"))
												{
													time = 24*30*valuare2;
												}
											float rezultatFinal = valuare1*time*valuare3;
											rezultatFinal = rezultatFinal + rezultatFinal*valuare4/100;
											String salam = Float.toString(rezultatFinal);
											textViewRezultat.setText(salam);
										}
									else
										{
											valuare1 = valuare1*1000;
											float time= 0;
											if(selectedRadio2.getText().equals("days"))
												{
													time =24*valuare2;
												}
											if(selectedRadio2.getText().equals("weeks"))
												{
													time = 24*7*valuare2;
												}
											if(selectedRadio2.getText().equals("months"))
												{
													time = 24*30*valuare2;
												}
											float rezultatFinal = valuare1*time*valuare3;
											rezultatFinal = rezultatFinal + rezultatFinal*valuare4/100;
											String salam = Float.toString(rezultatFinal);
											textViewRezultat.setText(salam);
										}
								}
							else
								{
									if(selectedRadio1.getText().equals("Watts"))
									{
										valuare1 = valuare1/1000;
										float time= 0;
										if(selectedRadio2.getText().equals("days"))
											{
												time =24*valuare2;
											}
										if(selectedRadio2.getText().equals("weeks"))
											{
												time = 24*7*valuare2;
											}
										if(selectedRadio2.getText().equals("months"))
											{
												time = 24*30*valuare2;
											}
										float rezultatFinal = valuare1*time*valuare3;
										rezultatFinal = rezultatFinal + rezultatFinal*valuare4/100;
										String salam = Float.toString(rezultatFinal);
										textViewRezultat.setText(salam);
									}
								else
									{
									
										float time= 0;
										if(selectedRadio2.getText().equals("days"))
											{
												time =24*valuare2;
											}
										if(selectedRadio2.getText().equals("weeks"))
											{
												time = 24*7*valuare2;
											}
										if(selectedRadio2.getText().equals("months"))
											{
												time = 24*30*valuare2;
											}
										float rezultatFinal = valuare1*time*valuare3;
										rezultatFinal = rezultatFinal + rezultatFinal*valuare4/100;
										String salam = Float.toString(rezultatFinal);
										textViewRezultat.setText(salam);
									}
								}
							
						}
					
					
					
					
			 	}
			 	
				
		public void functieClear(View V)
			{
				etConsum = (EditText)findViewById(R.id.editText1);
				etRunTime = (EditText)findViewById(R.id.editText2);
				etPrice = (EditText)findViewById(R.id.editText3);
				etVat = (EditText)findViewById(R.id.editText4);
				
				selectedRadio1 = (RadioButton)findViewById(R.id.radio0);
				selectedRadio2 = (RadioButton)findViewById(R.id.radio5);
				selectedRadio3 = (RadioButton)findViewById(R.id.radio8);
				
				textViewRezultat =(TextView)findViewById(R.id.textView7);
				
				etConsum.setText("");
				etRunTime.setText("");
				etPrice.setText("");
				etVat.setText("");
				
				
				selectedRadio1.setChecked(true);
				selectedRadio2.setChecked(true);
				selectedRadio3.setChecked(true);
				
				textViewRezultat.setText("0");
			}
		
		
		
		
			
		 	
		
			
			
		@Override
		public boolean onCreateOptionsMenu(Menu menu) 
			{
				// Inflate the menu; this adds items to the action bar if it is present.
				getMenuInflater().inflate(R.menu.main, menu);
				return true;
			}
	
		@Override
		public boolean onOptionsItemSelected(MenuItem item) 
			{
				// Handle action bar item clicks here. The action bar will
				// automatically handle clicks on the Home/Up button, so long
				// as you specify a parent activity in AndroidManifest.xml.
				int id = item.getItemId();
				if (id == R.id.action_settings) 
					{
						return true;
						
					}
				return super.onOptionsItemSelected(item);
				
			}
	
		/**
		 * A placeholder fragment containing a simple view.
		 */
		public static class PlaceholderFragment extends Fragment 
			{
		
				public PlaceholderFragment() 
					{
						
					}
		
				@Override
				public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) 
					{
						View rootView = inflater.inflate(R.layout.fragment_main, container,false);
						return rootView;
					}
			}
	
	}
