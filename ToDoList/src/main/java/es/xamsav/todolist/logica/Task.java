/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.xamsav.todolist.logica;

/**
 *
 * @author XamSav
 */
public class Task {
    public String nombre;
    public String priority;
    public String dueDate;
    public String status;
    public String notes;
    public String tags;
    public String assignedTo;
    public String createdBy;

    public Task(String nombre, String priority, String dueDate, String status, String notes, String tags, String assignedTo, String createdBy) {
        this.nombre = nombre;
        this.priority = priority;
        this.dueDate = dueDate;
        this.status = status;
        this.notes = notes;
        this.tags = tags;
        this.assignedTo = assignedTo;
        this.createdBy = createdBy;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPriority() {
        return priority;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getStatus() {
        return status;
    }

    public String getNotes() {
        return notes;
    }

    public String getTags() {
        return tags;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public String toString() {
        return "Priority=" + priority + ", Due date=" + dueDate + ", Status=" + status + ", Notes=" + notes + ", Tags=" + tags + ", assignedTo=" + assignedTo + ", createdBy=" + createdBy;
    }
    
    
}
