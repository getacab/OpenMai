import ibm_db
import ibm_db_dbi
import pandas
import time
import json
from json.encoder import JSONEncoder
import numpy as np
import datetime, calendar
import threading
import json


num_of_columns = 6   
read_from_database = True   
start_time = time.time()    
df_patient_face = pandas.DataFrame()
start_date = '1/1/2016'
end_date = '12/31/2019'
patient_list = """'2072441', '1551286','1884424', '1740099', '1889989', '2072441', '1374546', '1605375', 
                '1840367', '1413696','1853016', '1374546', '1889075','1915185'"""

threads = []
#patient_list = "'1374546"    




if __name__ == "__main__":
    file1 = open("JavaFile.txt", "w")  

    print('hrhk')
    with open('PingOne.json') as file1:
        data = json.load(file1)
    #print (data)

    for k in data:
        print(type(data[k]))
        if k == 'item':
            parseData = data[k]
            print(len(parseData))
            #print (parseData)
    print('----------------------')

    mgmtAPI = parseData[0]
    authAPI = parseData[1]

    methodXpansion = {'get':'@GetMapping','post':'@PostMapping', 'delete':'@DeleteMapping', 'put':'@PutMapping','patch':'@PatchMapping'}
    sec_level_name_store = ""
    f_level_name_store = ""
    print(type(authAPI))
    authAPI_list = authAPI['item']
    print(len(authAPI_list))
    for counter in range(0,len(authAPI_list)):
        firstLevel = authAPI_list[counter]
        f_level_name = firstLevel.get("name")
        f_level_item = firstLevel.get("item")

        #print(f_level_item)
        for sec_counter in range(0,len(f_level_item)):
            #print(type(f_level_item[sec_counter]))
            sec_level_data = f_level_item[sec_counter]
            sec_level_name = f_level_item[sec_counter].get('name')
            sec_level_name = sec_level_name.replace("&"," ").replace(")"," ").replace("("," ").replace("_"," ").replace("-"," ").replace("/"," ").title().replace(" ","")
            #print('--------------',sec_level_name)
            if 'item' in f_level_item[sec_counter]:
                sec_level = f_level_item[sec_counter].get('item')
                for thi_counter in range(0,len(sec_level)):
                    thi_level_data = sec_level[thi_counter]
                    thi_level_name = sec_level[thi_counter].get('name')
                    thi_level_name = thi_level_name.replace("&"," ").replace(")"," ").replace("("," ").replace("_"," ").replace("-"," ").title().replace(" ","")
                    if sec_level_name_store != sec_level_name:
                        sec_level_name_store = sec_level_name
                        print('//------------------' + f_level_name+ sec_level_name)
                    print("//",f_level_name,":", sec_level_name,":",thi_level_name )
                    mappingString = thi_level_data.get('request').get('method').lower()   
                    java_data = " public String " + mappingString + str(thi_level_name)+ '(){return "'+ thi_level_name +'";}'
                    print(methodXpansion.get(mappingString)+ '("'+ thi_level_data.get('request').get('url').get('raw').replace('{{apiPath}}',"").replace('{{authPath}}',"")+ '")', '\n', java_data)
            else:        
                if f_level_name_store != f_level_name:
                    f_level_name_store = f_level_name
                    print('//------------------' + f_level_name)
 
                mappingString = sec_level_data.get('request').get('method').lower()       
                print("//",f_level_name,":", sec_level_name)
                java_data = "public String " + mappingString + str(sec_level_name)+ '(){return "'+ sec_level_name +'";}'
                print(methodXpansion.get(mappingString)+ '("'+ sec_level_data.get('request').get('url').get('raw').replace('{{apiPath}}',"").replace('{{authPath}}',"")+ '")'+ '\n', java_data)

            #if(type(f_level_item['item']) is list):
            #    f_level_name = f_level_item("name"):

            