import java.util.HashSet;
import java.util.Set;

public class Data {

	public static String[][] SCORES = new String[][] {
	    {"Hawaii","43","Colorado State","34"},
			{"Massachusetts","63","Duquesne","15"},
			{"Rice","31","Prairie View A&M","28"},
			{"Wyoming","29","New Mexico State","7"},
			{"Alabama-Birmingham","52","Savannah State","0"},
			{"Ball State","42","Central Connecticut State","6"},
			{"California-Davis","44","San Jose State","38"},
			{"Central Florida","56","Connecticut","17"},
			{"Georgia State","24","Kennesaw State","20"},
			{"Louisiana-Monroe","34","Southeastern Louisiana","31"},
			{"Minnesota","48","New Mexico State","10"},
			{"Northwestern","31","Purdue","27"},
			{"Oklahoma State","58","Missouri State","17"},
			{"Texas A&M","59","Northwestern State","7"},
			{"Utah","41","Weber State","10"},
			{"Wake Forest","23","Tulane","17"},
			{"Colorado","45","Colorado State","13"},
			{"Duke","34","Army","14"},
			{"Eastern Michigan","51","Monmouth","17"},
			{"Michigan State","38","Utah State","31"},
			{"Nevada","72","Portland State","19"},
			{"Stanford","31","San Diego State","10"},
			{"Syracuse","55","Western Michigan","42"},
			{"Wisconsin","34","Western Kentucky","3"},
			{"Air Force","38","Stony Brook","0"},
			{"Alabama","51","Louisville","14"},
			{"Arizona State","49","Texas-San Antonio","7"},
			{"Arkansas","55","Eastern Illinois","20"},
			{"Arkansas State","48","Southeast Missouri State","21"},
			{"Auburn","21","Washington","16"},
			{"Baylor","55","Abilene Christian","27"},
			{"Boise State","56","Troy","20"},
			{"Boston College","55","Massachusetts","21"},
			{"Brigham Young","28","Arizona","23"},
			{"Buffalo","48","Delaware State","10"},
			{"California","24","North Carolina","17"},
			{"Charlotte","34","Fordham","10"},
			{"Cincinnati","26","UCLA","17"},
			{"Clemson","48","Furman","7"},
			{"Florida","53","Charleston Southern","6"},
			{"Fresno State","79","Idaho","13"},
			{"Georgia","45","Austin Peay","0"},
			{"Georgia Southern","37","South Carolina State","6"},
			{"Georgia Tech","41","Alcorn State","0"},
			{"Hawaii","59","Navy","41"},
			{"Houston","45","Rice","27"},
			{"Illinois","31","Kent State","24"},
			{"Indiana","38","Florida International","28"},
			{"Iowa","33","Northern Illinois","7"},
			{"Kansas State","27","South Dakota","24"},
			{"Kentucky","35","Central Michigan","20"},
			{"Liberty","52","Old Dominion","10"},
			{"Louisiana","49","Grambling State","17"},
			{"Louisiana Tech","30","South Alabama","26"},
			{"Marshall","35","Miami (OH)","28"},
			{"Maryland","34","Texas","29"},
			{"Memphis","66","Mercer","14"},
			{"Mississippi","47","Texas Tech","27"},
			{"Mississippi State","63","Stephen F. Austin","6"},
			{"Missouri","51","Tennessee-Martin","14"},
			{"New Mexico","62","Incarnate Word","30"},
			{"Nicholls State","26","Kansas","23"},
			{"North Carolina State","24","James Madison","13"},
			{"North Texas","46","Southern Methodist","23"},
			{"Northern Arizona","30","Texas-El Paso","10"},
			{"Notre Dame","24","Michigan","17"},
			{"Ohio","38","Howard","32"},
			{"Ohio State","77","Oregon State","31"},
			{"Oklahoma","63","Florida Atlantic","14"},
			{"Oregon","58","Bowling Green State","24"},
			{"Penn State","45","Appalachian State","38"},
			{"Pittsburgh","33","Albany","7"},
			{"Rutgers","35","Texas State","7"},
			{"South Carolina","49","Coastal Carolina","15"},
			{"South Florida","34","Elon","14"},
			{"Southern California","43","Nevada-Las Vegas","21"},
			{"Southern Mississippi","55","Jackson State","7"},
			{"Texas Christian","55","Southern","7"},
			{"Toledo","66","Virginia Military Institute","3"},
			{"Tulsa","38","Central Arkansas","27"},
			{"Vanderbilt","35","Middle Tennessee State","7"},
			{"Villanova","19","Temple","17"},
			{"Virginia","42","Richmond","13"},
			{"Washington State","41","Wyoming","19"},
			{"West Virginia","40","Tennessee","14"},
			{"Louisiana State","33","Miami (FL)","17"},
			{"North Carolina A&T","28","East Carolina","23"},
			{"Virginia Tech","24","Florida State","3"},
			{"Texas Christian","42","Southern Methodist","12"},
			{"Akron","41","Morgan State","7"},
			{"Alabama","57","Arkansas State","7"},
			{"Appalachian State","45","Charlotte","9"},
			{"Arizona State","16","Michigan State","13"},
			{"Army","38","Liberty","14"},
			{"Auburn","63","Alabama State","9"},
			{"Baylor","37","Texas-San Antonio","20"},
			{"Boise State","62","Connecticut","7"},
			{"Boston College","62","Holy Cross","14"},
			{"Buffalo","36","Temple","29"},
			{"California","21","Brigham Young","18"},
			{"Central Florida","38","South Carolina State","0"},
			{"Cincinnati","21","Miami (OH)","0"},
			{"Clemson","28","Texas A&M","26"},
			{"Coastal Carolina","47","Alabama-Birmingham","24"},
			{"Colorado","33","Nebraska","28"},
			{"Colorado State","34","Arkansas","27"},
			{"Duke","21","Northwestern","7"},
			{"East Carolina","41","North Carolina","19"},
			{"Eastern Michigan","20","Purdue","19"},
			{"Florida Atlantic","33","Air Force","27"},
			{"Florida International","28","Old Dominion","20"},
			{"Florida State","36","Samford","26"},
			{"Georgia","41","South Carolina","17"},
			{"Georgia Southern","34","Massachusetts","13"},
			{"Hawaii","43","Rice","29"},
			{"Houston","45","Arizona","18"},
			{"Illinois","34","Western Illinois","14"},
			{"Indiana","20","Virginia","16"},
			{"Iowa","13","Iowa State","3"},
			{"Kansas","31","Central Michigan","7"},
			{"Kent State","54","Howard","14"},
			{"Kentucky","27","Florida","16"},
			{"Louisiana State","31","Southeastern Louisiana","0"},
			{"Louisiana Tech","54","Southern","17"},
			{"Louisiana-Monroe","21","Southern Mississippi","20"},
			{"Louisville","31","Indiana State","7"},
			{"Maine","31","Western Kentucky","28"},
			{"Marshall","32","Eastern Kentucky","16"},
			{"Maryland","45","Bowling Green State","14"},
			{"Miami (FL)","77","Savannah State","0"},
			{"Michigan","49","Western Michigan","3"},
			{"Middle Tennessee State","61","Tennessee-Martin","37"},
			{"Minnesota","21","Fresno State","14"},
			{"Mississippi","76","Southern Illinois","41"},
			{"Mississippi State","31","Kansas State","10"},
			{"Missouri","40","Wyoming","13"},
			{"Navy","22","Memphis","21"},
			{"Nevada-Las Vegas","52","Texas-El Paso","24"},
			{"North Carolina State","41","Georgia State","7"},
			{"North Texas","58","Incarnate Word","16"},
			{"Notre Dame","24","Ball State","16"},
			{"Ohio State","52","Rutgers","3"},
			{"Oklahoma","49","UCLA","21"},
			{"Oklahoma State","55","South Alabama","13"},
			{"Oregon","62","Portland State","14"},
			{"Oregon State","48","Southern Utah","25"},
			{"Penn State","51","Pittsburgh","6"},
			{"San Diego State","28","Sacramento State","14"},
			{"South Florida","49","Georgia Tech","38"},
			{"Stanford","17","Southern California","3"},
			{"Syracuse","62","Wagner","10"},
			{"Tennessee","59","East Tennessee State","3"},
			{"Texas","28","Tulsa","21"},
			{"Texas State","36","Texas Southern","20"},
			{"Texas Tech","77","Lamar","0"},
			{"Troy","59","Florida A&M","7"},
			{"Tulane","42","Nicholls State","17"},
			{"Utah","17","Northern Illinois","6"},
			{"Utah State","60","New Mexico State","13"},
			{"Vanderbilt","41","Nevada","10"},
			{"Virginia Tech","62","William & Mary","17"},
			{"Wake Forest","51","Towson","20"},
			{"Washington","45","North Dakota","3"},
			{"Washington State","31","San Jose State","0"},
			{"West Virginia","52","Youngstown State","17"},
			{"Wisconsin","45","New Mexico","14"},
			{"Coastal Carolina","58","Campbell","21"},
			{"Boston College","41","Wake Forest","34"},
			{"Utah State","73","Tennessee Tech","12"},
			{"Memphis","59","Georgia State","22"},
			{"Akron","39","Northwestern","34"},
			{"Alabama","62","Mississippi","7"},
			{"Alabama-Birmingham","31","Tulane","24"},
			{"Arizona","62","Southern Utah","31"},
			{"Arkansas State","29","Tulsa","20"},
			{"Army","28","Hawaii","21"},
			{"Bowling Green State","42","Eastern Kentucky","35"},
			{"Brigham Young","24","Wisconsin","21"},
			{"Buffalo","35","Eastern Michigan","28"},
			{"California","45","Idaho State","23"},
			{"Charlotte","28","Old Dominion","25"},
			{"Cincinnati","63","Alabama A&M","7"},
			{"Clemson","38","Georgia Southern","7"},
			{"Colorado","45","New Hampshire","14"},
			{"Connecticut","56","Rhode Island","49"},
			{"Duke","40","Baylor","27"},
			{"Florida","48","Colorado State","10"},
			{"Florida Atlantic","49","Bethune-Cookman","28"},
			{"Florida International","63","Massachusetts","24"},
			{"Fresno State","38","UCLA","14"},
			{"Georgia","49","Middle Tennessee State","7"},
			{"Indiana","38","Ball State","10"},
			{"Iowa","38","Northern Iowa","14"},
			{"Kansas","55","Rutgers","14"},
			{"Kansas State","41","Texas-San Antonio","17"},
			{"Kentucky","48","Murray State","10"},
			{"Louisiana State","22","Auburn","21"},
			{"Louisville","20","Western Kentucky","17"},
			{"Miami (FL)","49","Toledo","24"},
			{"Michigan","45","Southern Methodist","20"},
			{"Minnesota","26","Miami (OH)","3"},
			{"Mississippi State","56","Louisiana","10"},
			{"Missouri","40","Purdue","37"},
			{"Navy","51","Lehigh","21"},
			{"Nevada","37","Oregon State","35"},
			{"Nevada-Las Vegas","46","Prairie View A&M","17"},
			{"New Mexico","42","New Mexico State","25"},
			{"North Texas","44","Arkansas","17"},
			{"Northern Illinois","24","Central Michigan","16"},
			{"Notre Dame","22","Vanderbilt","17"},
			{"Ohio State","40","Texas Christian","28"},
			{"Oklahoma","37","Iowa State","27"},
			{"Oklahoma State","44","Boise State","21"},
			{"Oregon","35","San Jose State","22"},
			{"Penn State","63","Kent State","10"},
			{"Pittsburgh","24","Georgia Tech","19"},
			{"San Diego State","28","Arizona State","21"},
			{"South Alabama","41","Texas State","31"},
			{"South Florida","25","Illinois","19"},
			{"Stanford","30","California-Davis","10"},
			{"Syracuse","30","Florida State","7"},
			{"Temple","35","Maryland","14"},
			{"Tennessee","24","Texas-El Paso","0"},
			{"Texas","37","Southern California","14"},
			{"Texas A&M","48","Louisiana-Monroe","10"},
			{"Texas Tech","63","Houston","49"},
			{"Troy","24","Nebraska","19"},
			{"Virginia","45","Ohio","31"},
			{"Washington","21","Utah","7"},
			{"Washington State","59","Eastern Washington","24"},
			{"Western Michigan","68","Delaware State","0"},
			{"Wyoming","17","Wofford","14"},
			{"Temple","31","Tulsa","17"},
			{"Central Florida","56","Florida Atlantic","36"},
			{"Penn State","63","Illinois","24"},
			{"Southern California","39","Washington State","36"},
			{"Alabama","45","Texas A&M","23"},
			{"Appalachian State","72","Gardner-Webb","7"},
			{"Arizona","35","Oregon State","14"},
			{"Arkansas State","27","Nevada-Las Vegas","20"},
			{"Auburn","34","Arkansas","3"},
			{"Baylor","26","Kansas","7"},
			{"Brigham Young","30","McNeese State","3"},
			{"Buffalo","42","Rutgers","13"},
			{"Central Michigan","17","Maine","5"},
			{"Cincinnati","34","Ohio","30"},
			{"Clemson","49","Georgia Tech","21"},
			{"Coastal Carolina","30","Louisiana","28"},
			{"Duke","55","North Carolina Central","13"},
			{"Florida","47","Tennessee","21"},
			{"Florida State","37","Northern Illinois","19"},
			{"Georgia","43","Missouri","29"},
			{"Hawaii","42","Duquesne","21"},
			{"Houston","70","Texas Southern","14"},
			{"Illinois State","35","Colorado State","19"},
			{"Iowa State","26","Akron","13"},
			{"Kentucky","28","Mississippi State","7"},
			{"Louisiana State","38","Louisiana Tech","21"},
			{"Maryland","42","Minnesota","13"},
			{"Massachusetts","49","Charlotte","31"},
			{"Memphis","52","South Alabama","35"},
			{"Miami (FL)","31","Florida International","17"},
			{"Miami (OH)","38","Bowling Green State","23"},
			{"Michigan","56","Nebraska","10"},
			{"Michigan State","35","Indiana","21"},
			{"Mississippi","38","Kent State","17"},
			{"New Mexico State","27","Texas-El Paso","20"},
			{"North Carolina","38","Pittsburgh","35"},
			{"North Carolina State","37","Marshall","20"},
			{"North Texas","47","Liberty","7"},
			{"Notre Dame","56","Wake Forest","27"},
			{"Ohio State","49","Tulane","6"},
			{"Oklahoma","28","Army","21"},
			{"Old Dominion","49","Virginia Tech","35"},
			{"Purdue","30","Boston College","13"},
			{"San Diego State","23","Eastern Michigan","20"},
			{"South Carolina","37","Vanderbilt","14"},
			{"South Florida","20","East Carolina","13"},
			{"Southern Methodist","31","Navy","30"},
			{"Southern Mississippi","40","Rice","22"},
			{"Stanford","38","Oregon","31"},
			{"Syracuse","51","Connecticut","21"},
			{"Texas","31","Texas Christian","16"},
			{"Texas Tech","41","Oklahoma State","17"},
			{"Texas-San Antonio","25","Texas State","21"},
			{"Toledo","63","Nevada","44"},
			{"Troy","35","Louisiana-Monroe","27"},
			{"Utah State","42","Air Force","32"},
			{"Virginia","27","Louisville","3"},
			{"Washington","27","Arizona State","20"},
			{"West Virginia","35","Kansas State","6"},
			{"Western Kentucky","28","Ball State","20"},
			{"Western Michigan","34","Georgia State","15"},
			{"Wisconsin","28","Iowa","17"},
			{"Miami (FL)","47","North Carolina","10"},
			{"Colorado","38","UCLA","16"},
			{"Tulane","40","Memphis","24"},
			{"Alabama","56","Louisiana","14"},
			{"Alabama-Birmingham","28","Charlotte","7"},
			{"Appalachian State","52","South Alabama","7"},
			{"Arizona State","52","Oregon State","24"},
			{"Army","42","Buffalo","13"},
			{"Auburn","24","Southern Mississippi","13"},
			{"Ball State","52","Kent State","24"},
			{"Boise State","34","Wyoming","14"},
			{"Boston College","45","Temple","35"},
			{"Central Florida","45","Pittsburgh","14"},
			{"Cincinnati","49","Connecticut","7"},
			{"Clemson","27","Syracuse","23"},
			{"East Carolina","37","Old Dominion","35"},
			{"Florida","13","Mississippi State","6"},
			{"Florida International","55","Arkansas-Pine Bluff","9"},
			{"Florida State","28","Louisville","24"},
			{"Fresno State","49","Toledo","27"},
			{"Georgia","38","Tennessee","12"},
			{"Georgia Southern","28","Arkansas State","21"},
			{"Georgia State","46","Louisiana-Monroe","14"},
			{"Georgia Tech","63","Bowling Green State","17"},
			{"Hawaii","44","San Jose State","41"},
			{"Indiana","24","Rutgers","17"},
			{"Kentucky","24","South Carolina","10"},
			{"Liberty","52","New Mexico","43"},
			{"Louisiana State","45","Mississippi","16"},
			{"Louisiana Tech","29","North Texas","27"},
			{"Marshall","20","Western Kentucky","17"},
			{"Michigan","20","Northwestern","17"},
			{"Michigan State","31","Central Michigan","20"},
			{"Middle Tennessee State","25","Florida Atlantic","24"},
			{"Nevada","28","Air Force","25"},
			{"North Carolina State","35","Virginia","21"},
			{"Northern Illinois","26","Eastern Michigan","23"},
			{"Notre Dame","38","Stanford","17"},
			{"Ohio","58","Massachusetts","42"},
			{"Ohio State","27","Penn State","26"},
			{"Oklahoma","66","Baylor","33"},
			{"Oklahoma State","48","Kansas","28"},
			{"Oregon","42","California","24"},
			{"Purdue","42","Nebraska","28"},
			{"Southern California","24","Arizona","20"},
			{"Southern Methodist","63","Houston Baptist","27"},
			{"Texas","19","Kansas State","14"},
			{"Texas A&M","24","Arkansas","17"},
			{"Texas Christian","17","Iowa State","14"},
			{"Texas-San Antonio","30","Texas-El Paso","21"},
			{"Troy","45","Coastal Carolina","21"},
			{"Vanderbilt","31","Tennessee State","27"},
			{"Virginia Tech","31","Duke","14"},
			{"Wake Forest","56","Rice","24"},
			{"Washington","35","Brigham Young","7"},
			{"Washington State","28","Utah","24"},
			{"West Virginia","42","Texas Tech","34"},
			{"Western Michigan","40","Miami (OH)","39"},
			{"Houston","41","Tulsa","26"},
			{"Troy","37","Georgia State","20"},
			{"Georgia Tech","66","Louisville","31"},
			{"Middle Tennessee State","34","Marshall","24"},
			{"Utah State","45","Brigham Young","20"},
			{"Air Force","35","Navy","7"},
			{"Alabama","65","Arkansas","31"},
			{"Alabama-Birmingham","28","Louisiana Tech","7"},
			{"Arizona","24","California","17"},
			{"Baylor","37","Kansas State","34"},
			{"Buffalo","34","Central Michigan","24"},
			{"Central Florida","48","Southern Methodist","20"},
			{"Cincinnati","37","Tulane","21"},
			{"Clemson","63","Wake Forest","3"},
			{"Colorado","28","Arizona State","21"},
			{"Colorado State","42","San Jose State","30"},
			{"Florida","27","Louisiana State","19"},
			{"Florida Atlantic","52","Old Dominion","33"},
			{"Fresno State","21","Nevada","3"},
			{"Georgia","41","Vanderbilt","13"},
			{"Georgia Southern","48","South Alabama","13"},
			{"Hawaii","17","Wyoming","13"},
			{"Illinois","38","Rutgers","17"},
			{"Iowa","48","Minnesota","31"},
			{"Iowa State","48","Oklahoma State","42"},
			{"Louisiana","42","Texas State","27"},
			{"Memphis","55","Connecticut","14"},
			{"Miami (FL)","28","Florida State","27"},
			{"Miami (OH)","41","Akron","17"},
			{"Michigan","42","Maryland","21"},
			{"Mississippi","70","Louisiana-Monroe","21"},
			{"Mississippi State","23","Auburn","9"},
			{"New Mexico","50","Nevada-Las Vegas","14"},
			{"New Mexico State","49","Liberty","41"},
			{"North Carolina State","28","Boston College","23"},
			{"North Texas","27","Texas-El Paso","24"},
			{"Northern Illinois","24","Ball State","16"},
			{"Northwestern","29","Michigan State","19"},
			{"Notre Dame","45","Virginia Tech","23"},
			{"Ohio","27","Kent State","26"},
			{"Ohio State","49","Indiana","26"},
			{"Pittsburgh","44","Syracuse","37"},
			{"San Diego State","19","Boise State","13"},
			{"South Carolina","37","Missouri","35"},
			{"South Florida","58","Massachusetts","42"},
			{"Temple","49","East Carolina","6"},
			{"Texas","48","Oklahoma","45"},
			{"Texas A&M","20","Kentucky","14"},
			{"Texas-San Antonio","20","Rice","3"},
			{"Toledo","52","Bowling Green State","36"},
			{"Utah","40","Stanford","21"},
			{"Washington","31","UCLA","24"},
			{"Washington State","56","Oregon State","37"},
			{"West Virginia","38","Kansas","22"},
			{"Western Michigan","27","Eastern Michigan","24"},
			{"Wisconsin","41","Nebraska","24"},
			{"Appalachian State","35","Arkansas State","9"},
			{"Georgia Southern","15","Texas State","13"},
			{"Texas Tech","17","Texas Christian","14"},
			{"San Diego State","21","Air Force","17"},
			{"South Florida","25","Tulsa","24"},
			{"Utah","42","Arizona","10"},
			{"Alabama","39","Missouri","10"},
			{"Alabama-Birmingham","42","Rice","0"},
			{"Army","52","San Jose State","3"},
	    {"Ball State","24","Central Michigan","23"},
			{"Boise State","31","Nevada","27"},
			{"Boston College","38","Louisville","20"},
			{"Brigham Young","49","Hawaii","23"},
			{"Buffalo","24","Akron","6"},
			{"Central Florida","31","Memphis","30"},
			{"Charlotte","40","Western Kentucky","14"},
			{"Colorado State","20","New Mexico","18"},
			{"Duke","28","Georgia Tech","14"},
			{"Eastern Michigan","28","Toledo","26"},
			{"Florida","37","Vanderbilt","27"},
			{"Florida International","24","Middle Tennessee State","21"},
			{"Fresno State","27","Wyoming","3"},
			{"Houston","42","East Carolina","20"},
			{"Iowa","42","Indiana","16"},
			{"Iowa State","30","West Virginia","14"},
			{"Kansas State","31","Oklahoma State","12"},
			{"Liberty","22","Troy","16"},
			{"Louisiana","66","New Mexico State","38"},
			{"Louisiana State","36","Georgia","16"},
			{"Louisiana Tech","31","Texas-San Antonio","3"},
			{"Louisiana-Monroe","45","Coastal Carolina","20"},
			{"Marshall","42","Old Dominion","20"},
			{"Maryland","34","Rutgers","7"},
			{"Miami (OH)","31","Kent State","6"},
			{"Michigan","38","Wisconsin","13"},
			{"Michigan State","21","Penn State","17"},
			{"Mississippi","37","Arkansas","33"},
			{"North Texas","30","Southern Mississippi","7"},
			{"Northern Illinois","24","Ohio","21"},
			{"Northwestern","34","Nebraska","31"},
			{"Notre Dame","19","Pittsburgh","14"},
			{"Ohio State","30","Minnesota","14"},
			{"Oregon","30","Washington","27"},
			{"Purdue","46","Illinois","7"},
			{"South Alabama","45","Alabama State","7"},
			{"Southern California","31","Colorado","20"},
			{"Temple","24","Navy","17"},
			{"Tennessee","30","Auburn","24"},
			{"Texas","23","Baylor","17"},
			{"Texas A&M","26","South Carolina","23"},
			{"UCLA","37","California","7"},
			{"Utah State","59","Nevada-Las Vegas","28"},
			{"Virginia","16","Miami (FL)","13"},
			{"Virginia Tech","22","North Carolina","19"},
			{"Western Michigan","42","Bowling Green State","35"},
			{"Arkansas State","51","Georgia State","35"},
			{"Stanford","20","Arizona State","13"},
			{"Air Force","41","Nevada-Las Vegas","35"},
			{"Boise State","56","Colorado State","28"},
			{"Akron","24","Kent State","23"},
			{"Alabama","58","Tennessee","21"},
			{"Alabama-Birmingham","29","North Texas","21"},
			{"Appalachian State","27","Louisiana","17"},
			{"Arkansas","23","Tulsa","0"},
			{"Army","31","Miami (OH)","30"},
			{"Auburn","31","Mississippi","16"},
			{"Buffalo","31","Toledo","17"},
			{"California","49","Oregon State","7"},
			{"Central Florida","37","East Carolina","10"},
			{"Clemson","41","North Carolina State","7"},
			{"Coastal Carolina","24","Massachusetts","13"},
			{"Eastern Michigan","42","Ball State","20"},
			{"Florida International","36","Rice","17"},
			{"Florida State","38","Wake Forest","17"},
			{"Fresno State","38","New Mexico","7"},
			{"Georgia Southern","48","New Mexico State","31"},
			{"Houston","49","Navy","36"},
			{"Iowa","23","Maryland","0"},
			{"Kentucky","14","Vanderbilt","7"},
			{"Liberty","48","Idaho State","41"},
			{"Louisiana State","19","Mississippi State","3"},
			{"Louisiana Tech","31","Texas-El Paso","24"},
			{"Louisiana-Monroe","20","Texas State","14"},
			{"Marshall","31","Florida Atlantic","7"},
			{"Michigan","21","Michigan State","7"},
			{"Middle Tennessee State","21","Charlotte","13"},
			{"Missouri","65","Memphis","33"},
			{"Nebraska","53","Minnesota","28"},
			{"Nevada","40","Hawaii","22"},
			{"Northwestern","18","Rutgers","15"},
			{"Ohio","49","Bowling Green State","14"},
			{"Oklahoma","52","Texas Christian","27"},
			{"Old Dominion","37","Western Kentucky","34"},
			{"Penn State","33","Indiana","28"},
			{"Purdue","49","Ohio State","20"},
			{"San Diego State","16","San Jose State","13"},
			{"South Florida","38","Connecticut","30"},
			{"Southern Methodist","27","Tulane","23"},
			{"Southern Mississippi","27","Texas-San Antonio","17"},
			{"Syracuse","40","North Carolina","37"},
			{"Temple","24","Cincinnati","17"},
			{"Texas Tech","48","Kansas","16"},
			{"UCLA","31","Arizona","30"},
			{"Utah","41","Southern California","28"},
			{"Utah State","24","Wyoming","16"},
			{"Virginia","28","Duke","14"},
			{"Washington","27","Colorado","13"},
			{"Washington State","34","Oregon","20"},
			{"Western Michigan","35","Central Michigan","10"},
			{"Wisconsin","49","Illinois","20"},
			{"Troy","38","South Alabama","17"},
			{"Georgia Southern","34","Appalachian State","14"},
			{"Georgia Tech","49","Virginia Tech","28"},
			{"Ohio","52","Ball State","14"},
			{"Toledo","51","Western Michigan","24"},
			{"West Virginia","58","Baylor","14"},
			{"Boston College","27","Miami (FL)","14"},
			{"Minnesota","38","Indiana","31"},
			{"Utah","41","UCLA","10"},
			{"Wyoming","34","Colorado State","21"},
			{"Akron","17","Central Michigan","10"},
			{"Alabama-Birmingham","19","Texas-El Paso","0"},
			{"Arizona","44","Oregon","15"},
			{"Arizona State","38","Southern California","35"},
			{"Army","37","Eastern Michigan","22"},
			{"Boise State","48","Air Force","38"},
			{"California","12","Washington","10"},
			{"Charlotte","20","Southern Mississippi","17"},
			{"Cincinnati","26","Southern Methodist","20"},
			{"Clemson","59","Florida State","10"},
			{"Coastal Carolina","37","Georgia State","34"},
			{"Florida International","38","Western Kentucky","17"},
			{"Fresno State","50","Hawaii","20"},
			{"Georgia","36","Florida","17"},
			{"Houston","57","South Florida","36"},
			{"Iowa State","40","Texas Tech","31"},
			{"Kansas","27","Texas Christian","26"},
			{"Kentucky","15","Missouri","14"},
			{"Louisiana","47","Arkansas State","43"},
			{"Louisiana Tech","21","Florida Atlantic","13"},
			{"Maryland","63","Illinois","33"},
			{"Massachusetts","22","Connecticut","17"},
			{"Michigan State","23","Purdue","13"},
			{"Middle Tennessee State","51","Old Dominion","17"},
			{"Mississippi State","28","Texas A&M","13"},
			{"Nebraska","45","Bethune-Cookman","9"},
			{"Nevada","28","San Diego State","24"},
			{"North Texas","41","Rice","17"},
			{"Northern Illinois","7","Brigham Young","6"},
			{"Northwestern","31","Wisconsin","17"},
			{"Notre Dame","44","Navy","22"},
			{"Oklahoma","51","Kansas State","14"},
			{"Oklahoma State","38","Texas","35"},
			{"Oregon State","41","Colorado","34"},
			{"Penn State","30","Iowa","24"},
			{"Pittsburgh","54","Duke","45"},
			{"San Jose State","50","Nevada-Las Vegas","37"},
			{"South Carolina","27","Tennessee","24"},
			{"Syracuse","51","North Carolina State","41"},
			{"Texas State","27","New Mexico State","20"},
			{"Tulane","24","Tulsa","17"},
			{"Utah State","61","New Mexico","19"},
			{"Vanderbilt","45","Arkansas","31"},
			{"Virginia","31","North Carolina","21"},
			{"Wake Forest","56","Louisville","35"},
			{"Washington State","41","Stanford","38"},
			{"Buffalo","51","Miami (OH)","42"},
			{"Kent State","35","Bowling Green State","28"},
			{"Toledo","45","Ball State","13"},
			{"Central Florida","52","Temple","40"},
			{"Northern Illinois","36","Akron","26"},
			{"Ohio","59","Western Michigan","14"},
			{"Arizona","42","Colorado","34"},
			{"Middle Tennessee State","29","Western Kentucky","10"},
			{"Pittsburgh","23","Virginia","13"},
			{"Alabama","29","Louisiana State","0"},
			{"Alabama-Birmingham","52","Texas-San Antonio","3"},
			{"Appalachian State","23","Coastal Carolina","7"},
			{"Arizona State","38","Utah","20"},
			{"Arkansas State","38","South Alabama","14"},
			{"Army","17","Air Force","14"},
			{"Auburn","28","Texas A&M","24"},
			{"Baylor","35","Oklahoma State","31"},
			{"Boise State","21","Brigham Young","16"},
			{"Boston College","31","Virginia Tech","21"},
			{"Cincinnati","42","Navy","0"},
			{"Clemson","77","Louisville","16"},
			{"Duke","20","Miami (FL)","12"},
			{"Eastern Michigan","17","Central Michigan","7"},
			{"Florida Atlantic","49","Florida International","14"},
			{"Fresno State","48","Nevada-Las Vegas","3"},
			{"Georgia","34","Kentucky","17"},
			{"Georgia Tech","38","North Carolina","28"},
			{"Illinois","55","Minnesota","31"},
			{"Iowa State","27","Kansas","3"},
			{"Louisiana-Monroe","44","Georgia Southern","25"},
			{"Massachusetts","62","Liberty","59"},
			{"Memphis","59","East Carolina","41"},
			{"Michigan","42","Penn State","7"},
			{"Michigan State","24","Maryland","3"},
			{"Mississippi State","45","Louisiana Tech","3"},
			{"Missouri","38","Florida","17"},
			{"New Mexico State","52","Alcorn State","42"},
			{"North Carolina State","47","Florida State","28"},
			{"Notre Dame","31","Northwestern","21"},
			{"Ohio State","36","Nebraska","31"},
			{"Oklahoma","51","Texas Tech","46"},
			{"Oregon","42","UCLA","21"},
			{"Purdue","38","Iowa","36"},
			{"San Diego State","31","New Mexico","23"},
			{"South Carolina","48","Mississippi","44"},
			{"Southern California","38","Oregon State","21"},
			{"Southern Methodist","45","Houston","31"},
			{"Southern Mississippi","26","Marshall","24"},
			{"Syracuse","41","Wake Forest","24"},
			{"Tennessee","14","Charlotte","3"},
			{"Texas Christian","14","Kansas State","13"},
			{"Texas State","40","Georgia State","31"},
			{"Texas-El Paso","34","Rice","26"},
			{"Troy","26","Louisiana","16"},
			{"Tulane","41","South Florida","15"},
			{"Tulsa","49","Connecticut","19"},
			{"Utah State","56","Hawaii","17"},
			{"Washington","27","Stanford","23"},
			{"Washington State","19","California","13"},
			{"West Virginia","42","Texas","41"},
			{"Wisconsin","31","Rutgers","17"},
			{"Wyoming","24","San Jose State","9"},
			{"Buffalo","48","Kent State","14"},
			{"Miami (OH)","30","Ohio","28"},
			{"Northern Illinois","38","Toledo","15"},
			{"Wake Forest","27","North Carolina State","23"},
			{"Boise State","24","Fresno State","17"},
			{"Syracuse","54","Louisville","23"},
			{"Air Force","42","New Mexico","24"},
			{"Alabama","24","Mississippi State","0"},
			{"Alabama-Birmingham","26","Southern Mississippi","23"},
			{"Appalachian State","38","Texas State","7"},
			{"Arizona State","31","UCLA","28"},
			{"Arkansas State","44","Coastal Carolina","16"},
			{"Army","31","Lafayette","13"},
			{"Bowling Green State","24","Central Michigan","13"},
			{"Brigham Young","35","Massachusetts","16"},
			{"California","15","Southern California","14"},
			{"Central Florida","35","Navy","24"},
			{"Cincinnati","35","South Florida","23"},
			{"Clemson","27","Boston College","7"},
			{"Duke","42","North Carolina","35"},
			{"Eastern Michigan","27","Akron","7"},
			{"Florida","35","South Carolina","31"},
			{"Florida Atlantic","34","Western Kentucky","15"},
			{"Florida International","45","Texas-San Antonio","7"},
			{"Georgia","27","Auburn","10"},
			{"Georgia Tech","27","Miami (FL)","21"},
			{"Indiana","34","Maryland","32"},
			{"Iowa State","28","Baylor","14"},
			{"Kansas State","21","Kansas","17"},
			{"Louisiana","36","Georgia State","22"},
			{"Louisiana State","24","Arkansas","17"},
			{"Louisiana Tech","28","Rice","13"},
			{"Louisiana-Monroe","38","South Alabama","10"},
			{"Marshall","30","Charlotte","13"},
			{"Memphis","47","Tulsa","21"},
			{"Michigan","42","Rutgers","7"},
			{"Middle Tennessee State","48","Texas-El Paso","32"},
			{"Minnesota","41","Purdue","10"},
			{"Missouri","33","Vanderbilt","28"},
			{"Nebraska","54","Illinois","35"},
			{"Nevada","49","Colorado State","10"},
			{"Nevada-Las Vegas","27","San Diego State","24"},
			{"Northwestern","14","Iowa","10"},
			{"Notre Dame","42","Florida State","13"},
			{"Ohio State","26","Michigan State","6"},
			{"Oklahoma","48","Oklahoma State","47"},
			{"Old Dominion","34","North Texas","31"},
			{"Penn State","22","Wisconsin","10"},
			{"Pittsburgh","52","Virginia Tech","22"},
			{"Southern Methodist","62","Connecticut","50"},
			{"Stanford","48","Oregon State","17"},
			{"Temple","59","Houston","49"},
			{"Tennessee","24","Kentucky","7"},
			{"Texas","41","Texas Tech","34"},
			{"Texas A&M","38","Mississippi","24"},
			{"Troy","35","Georgia Southern","21"},
			{"Tulane","24","East Carolina","18"},
			{"Utah","32","Oregon","25"},
			{"Utah State","62","San Jose State","24"},
			{"Virginia","45","Liberty","24"},
			{"Washington State","31","Colorado","7"},
			{"West Virginia","47","Texas Christian","10"},
			{"Ball State","42","Western Michigan","41"},
			{"Miami (OH)","13","Northern Illinois","7"},
			{"Ohio","52","Buffalo","17"},
			{"Houston","48","Tulane","17"},
			{"North Texas","41","Florida Atlantic","38"},
			{"Toledo","56","Kent State","34"},
			{"Boise State","45","New Mexico","14"},
			{"Memphis","28","Southern Methodist","18"},
			{"Alabama","50","Citadel","17"},
			{"Appalachian State","45","Georgia State","17"},
			{"Arkansas State","31","Louisiana-Monroe","17"},
			{"Army","28","Colgate","14"},
			{"Auburn","53","Liberty","0"},
			{"Bowling Green State","21","Akron","6"},
			{"Brigham Young","45","New Mexico State","10"},
			{"Central Florida","38","Cincinnati","13"},
			{"Clemson","35","Duke","6"},
			{"East Carolina","55","Connecticut","21"},
			{"Florida","63","Idaho","10"},
			{"Florida International","42","Charlotte","35"},
			{"Florida State","22","Boston College","21"},
			{"Fresno State","23","San Diego State","14"},
			{"Georgia","66","Massachusetts","27"},
			{"Georgia Southern","41","Coastal Carolina","17"},
			{"Georgia Tech","30","Virginia","27"},
			{"Hawaii","35","Nevada-Las Vegas","28"},
			{"Iowa","63","Illinois","0"},
			{"Kansas State","21","Texas Tech","6"},
			{"Kentucky","34","Middle Tennessee State","23"},
			{"Louisiana","48","South Alabama","38"},
			{"Louisiana State","42","Rice","10"},
			{"Marshall","23","Texas-San Antonio","0"},
			{"Miami (FL)","38","Virginia Tech","14"},
			{"Michigan","31","Indiana","20"},
			{"Mississippi State","52","Arkansas","6"},
			{"Missouri","50","Tennessee","17"},
			{"Navy","37","Tulsa","29"},
			{"Nebraska","9","Michigan State","6"},
			{"Nevada","21","San Jose State","12"},
			{"North Carolina","49","Western Carolina","26"},
			{"North Carolina State","52","Louisville","10"},
			{"Northwestern","24","Minnesota","14"},
			{"Notre Dame","36","Syracuse","3"},
			{"Ohio State","52","Maryland","51"},
			{"Oklahoma","55","Kansas","40"},
			{"Oklahoma State","45","West Virginia","41"},
			{"Old Dominion","77","Virginia Military Institute","14"},
			{"Oregon","31","Arizona State","29"},
			{"Penn State","20","Rutgers","7"},
			{"Pittsburgh","34","Wake Forest","13"},
			{"South Carolina","49","Chattanooga","9"},
			{"Southern Mississippi","21","Louisiana Tech","20"},
			{"Temple","27","South Florida","17"},
			{"Texas","24","Iowa State","10"},
			{"Texas A&M","41","Alabama-Birmingham","20"},
			{"Texas Christian","16","Baylor","9"},
			{"Troy","12","Texas State","7"},
			{"UCLA","34","Southern California","27"},
			{"Utah","30","Colorado","7"},
			{"Utah State","29","Colorado State","24"},
			{"Vanderbilt","36","Mississippi","29"},
			{"Washington","42","Oregon State","23"},
			{"Washington State","69","Arizona","28"},
			{"Western Kentucky","40","Texas-El Paso","16"},
			{"Wisconsin","47","Purdue","44"},
			{"Wyoming","35","Air Force","27"},
			{"Miami (OH)","42","Ball State","21"},
			{"Western Michigan","28","Northern Illinois","21"},
			{"Air Force","27","Colorado State","19"},
			{"Mississippi State","35","Mississippi","3"},
			{"Buffalo","44","Bowling Green State","14"},
			{"Central Florida","38","South Florida","10"},
			{"Cincinnati","56","East Carolina","6"},
			{"Eastern Michigan","28","Kent State","20"},
			{"Iowa","31","Nebraska","28"},
			{"Memphis","52","Houston","31"},
			{"Missouri","38","Arkansas","0"},
			{"Ohio","49","Akron","28"},
			{"Oklahoma","59","West Virginia","56"},
			{"Oregon","55","Oregon State","15"},
			{"Texas","24","Kansas","17"},
			{"Toledo","51","Central Michigan","13"},
			{"Virginia Tech","34","Virginia","31"},
			{"Washington","28","Washington State","15"},
			{"Alabama","52","Auburn","21"},
			{"Appalachian State","21","Troy","10"},
			{"Arizona State","41","Arizona","40"},
			{"Arkansas State","33","Texas State","7"},
			{"Baylor","35","Texas Tech","24"},
			{"Boise State","33","Utah State","24"},
			{"California","33","Colorado","21"},
			{"Charlotte","27","Florida Atlantic","24"},
			{"Clemson","56","South Carolina","35"},
			{"Florida","41","Florida State","14"},
			{"Fresno State","31","San Jose State","13"},
			{"Georgia","45","Georgia Tech","21"},
			{"Georgia Southern","35","Georgia State","14"},
			{"Hawaii","31","San Diego State","30"},
			{"Iowa State","42","Kansas State","38"},
			{"Kentucky","56","Louisville","10"},
			{"Liberty","28","New Mexico State","21"},
			{"Louisiana","31","Louisiana-Monroe","28"},
			{"Marshall","28","Florida International","25"},
			{"Miami (FL)","24","Pittsburgh","3"},
			{"Michigan State","14","Rutgers","10"},
			{"Middle Tennessee State","27","Alabama-Birmingham","3"},
			{"Minnesota","37","Wisconsin","15"},
			{"Nevada-Las Vegas","34","Nevada","29"},
			{"North Carolina State","34","North Carolina","28"},
			{"North Texas","24","Texas-San Antonio","21"},
			{"Northwestern","24","Illinois","16"},
			{"Notre Dame","24","Southern California","17"},
			{"Ohio State","62","Michigan","39"},
			{"Penn State","38","Maryland","3"},
			{"Purdue","28","Indiana","21"},
			{"Rice","27","Old Dominion","13"},
			{"South Alabama","31","Coastal Carolina","28"},
			{"Southern Mississippi","39","Texas-El Paso","7"},
			{"Stanford","49","UCLA","42"},
			{"Syracuse","42","Boston College","21"},
			{"Temple","57","Connecticut","7"},
			{"Texas A&M","74","Louisiana State","72"},
			{"Texas Christian","31","Oklahoma State","24"},
			{"Tulane","29","Navy","28"},
			{"Tulsa","27","Southern Methodist","24"},
			{"Utah","35","Brigham Young","27"},
			{"Vanderbilt","38","Tennessee","13"},
			{"Wake Forest","59","Duke","7"},
			{"Western Kentucky","30","Louisiana Tech","15"},
			{"Wyoming","31","New Mexico","3"} };

		private static final String[] FCS = { "Texas Southern", "Western Carolina", "Austin Peay",
				"Nicholls State", "Southern Utah", "Indiana State", "Chattanooga",
				"Weber State", "Maine", "Tennessee-Martin", "Murray State",
				"Cal-San Luis Obispo", "Western Illinois", "Savannah State",
				"Lamar", "Sacramento State", "Eastern Washington",
				"Bethune-Cookman", "Samford", "Northwestern St(LA)",
				"Eastern Illinois", "Morgan State", "Idaho State", "Norfolk State",
				"New Hampshire", "Central Arkansas", "Jacksonville St",
				"Missouri State", "So Carolina State", "Alabama A+M",
				"North Dakota St", "Fordham", "Eastern Kentucky", "Florida A+M",
				"Virginia Military", "William + Mary", "Colgate", "Portland State",
				"South Dakota State", "Gardner-Webb", "Tennessee Tech",
				"South Dakota", "Montana State", "Stephen F Austin", "Villanova",
				"Illinois State", "James Madison", "Northern Iowa", "Elon",
				"Howard", "Youngstown State", "Grambling", "Furman", "Towson",
				"Charleston Southern", "Abilene Christian", "S E Missouri St",
				"S E Louisiana", "Southern Univ", "Prairie View",
				"Northern Colorado", "The Citadel", "Sam Houston State",
				"Alabama State", "Northern Arizona", "Southern Illinois",
				"Wofford", "Presbyterian", "Wagner", "Stony Brook", "Alcorn State",
				"McNeese State", "Jackson State", "Arkansas-Pine Bluff",
				"Richmond", "No Carolina Central", "Delaware", "UC-Davis",
				"North Dakota State", "Incarnate Word", "Rhode Island", "Monmouth",
				"Grambling State", "Southern", "North Dakota", "Cal Poly",
				"Delaware State", "Virginia Military Institute",
				"Stephen F. Austin", "Lafayette", "Prairie View A&M",
				"Northwestern State", "William & Mary", "Tennessee State",
				"Houston Baptist", "California-Davis", "Mississippi Valley State",
				"Florida A&M", "Citadel", "Hampton", "Southeast Missouri State",
				"Mercer", "Alabama A&M", "North Carolina Central",
				"Southeastern Louisiana", "Jacksonville State", "Albany",
				"North Carolina A&T", "South Carolina State", "Holy Cross",
				"Central Connecticut State", "Montana", "Idaho", "Lehigh", "Duquesne",
				"East Tennessee State", "Kennesaw State", "Campbell", "Southern Mississippi"};

		public static final Set<String> FCS_TEAMS = new HashSet<String>();

		static {
			for (String s : FCS) {
				FCS_TEAMS.add(s);
			}
		}

}