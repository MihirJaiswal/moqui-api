import org.moqui.context.ExecutionContext
import org.moqui.entity.EntityValue
ExecutionContext ec = context.ec

def trainingName = context.trainingName
def trainingDate = context.trainingDate
def trainingPrice = context.trainingPrice
def trainingDuration = context.trainingDuration

if (!trainingName) {
    ec.message.addError("Training name is required.")
    return
}

if (!trainingDate) {
    ec.message.addError("Training date is required.")
    return
}

def trainingID = ec.entity.sequencedIdPrimary("MoquiTraining", null, null)

EntityValue trainingRecord = ec.entity.makeValue("moqui.training.MoquiTraining")

trainingRecord.set("trainingID", trainingID) 
trainingRecord.set("trainingName", trainingName)
trainingRecord.set("trainingDate", trainingDate)

if (trainingPrice != null) trainingRecord.set("trainingPrice", trainingPrice)
if (trainingDuration != null) trainingRecord.set("trainingDuration", trainingDuration)

trainingRecord = trainingRecord.create()

context.trainingID = trainingRecord.get("trainingID")