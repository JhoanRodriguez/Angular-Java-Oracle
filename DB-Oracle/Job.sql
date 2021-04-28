-- JOB para ejecución temporal
DECLARE 
date_s TIMESTAMP; 
BEGIN
date_s := to_timestamp_tz('2021-03-25 00:00:00','YYYY-MM-DD HH24:MI:SS'); --Definimos el formato de la fecha de inicio
dbms_scheduler.create_job(
job_name => 'GENERAR_AGENDA', 
job_type => 'PLSQL_BLOCK',
job_action => 'COBRANZA.CREAR_AGENDA;', --Procedimiento a ejecutar
start_date => date_s,
repeat_interval => 'FREQ=DAILY', --Frecuencia de ejecicion
auto_drop => false, 
end_date => null,
comments => 'Asignacion de clientes realizada');
END;